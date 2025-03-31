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
 * {@link GetRepoBuildRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoBuildRecordResponseBody</p>
 */
public class GetRepoBuildRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildRecordId")
    private String buildRecordId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("Image")
    private Image image;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetRepoBuildRecordResponseBody model) {
            this.buildRecordId = model.buildRecordId;
            this.code = model.code;
            this.endTime = model.endTime;
            this.image = model.image;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the image building record.</p>
         * 
         * <strong>example:</strong>
         * <p>79174CBA-8556-443A-8976-22C922D7****</p>
         */
        public Builder buildRecordId(String buildRecordId) {
            this.buildRecordId = buildRecordId;
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
         * <p>The time when the image building was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>1568718698000</p>
         */
        public Builder endTime(Long endTime) {
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
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>a78ec6fb-16ea-4649-93b7-f52afba7d9de1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the image building started.</p>
         * 
         * <strong>example:</strong>
         * <p>1568718468000</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetRepoBuildRecordResponseBody build() {
            return new GetRepoBuildRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRepoBuildRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetRepoBuildRecordResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageTag")
        private String imageTag;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespaceName")
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

            private Builder() {
            } 

            private Builder(Image model) {
                this.imageTag = model.imageTag;
                this.repoName = model.repoName;
                this.repoNamespaceName = model.repoNamespaceName;
            } 

            /**
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The name of the namespace to which the image repository belongs.</p>
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
}
