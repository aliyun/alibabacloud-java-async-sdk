// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainContractContentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAntChainContractContentResponseBody</p>
 */
public class CreateAntChainContractContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateAntChainContractContentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntChainContractContentResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateAntChainContractContentResponseBody build() {
            return new CreateAntChainContractContentResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("ContentId")
        private String contentId;

        @NameInMap("ContentName")
        private String contentName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("IsDirectory")
        private Boolean isDirectory;

        @NameInMap("ParentContentId")
        private String parentContentId;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Result(Builder builder) {
            this.content = builder.content;
            this.contentId = builder.contentId;
            this.contentName = builder.contentName;
            this.createTime = builder.createTime;
            this.isDirectory = builder.isDirectory;
            this.parentContentId = builder.parentContentId;
            this.projectId = builder.projectId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentId
         */
        public String getContentId() {
            return this.contentId;
        }

        /**
         * @return contentName
         */
        public String getContentName() {
            return this.contentName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return isDirectory
         */
        public Boolean getIsDirectory() {
            return this.isDirectory;
        }

        /**
         * @return parentContentId
         */
        public String getParentContentId() {
            return this.parentContentId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String content; 
            private String contentId; 
            private String contentName; 
            private String createTime; 
            private Boolean isDirectory; 
            private String parentContentId; 
            private String projectId; 
            private String updateTime; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentId.
             */
            public Builder contentId(String contentId) {
                this.contentId = contentId;
                return this;
            }

            /**
             * ContentName.
             */
            public Builder contentName(String contentName) {
                this.contentName = contentName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IsDirectory.
             */
            public Builder isDirectory(Boolean isDirectory) {
                this.isDirectory = isDirectory;
                return this;
            }

            /**
             * ParentContentId.
             */
            public Builder parentContentId(String parentContentId) {
                this.parentContentId = parentContentId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
