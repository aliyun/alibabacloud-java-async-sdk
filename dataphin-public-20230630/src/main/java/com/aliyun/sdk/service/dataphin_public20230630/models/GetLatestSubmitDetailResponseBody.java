// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetLatestSubmitDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetLatestSubmitDetailResponseBody</p>
 */
public class GetLatestSubmitDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubmitDetailResult")
    private SubmitDetailResult submitDetailResult;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetLatestSubmitDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.submitDetailResult = builder.submitDetailResult;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLatestSubmitDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return submitDetailResult
     */
    public SubmitDetailResult getSubmitDetailResult() {
        return this.submitDetailResult;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private SubmitDetailResult submitDetailResult; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * SubmitDetailResult.
         */
        public Builder submitDetailResult(SubmitDetailResult submitDetailResult) {
            this.submitDetailResult = submitDetailResult;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLatestSubmitDetailResponseBody build() {
            return new GetLatestSubmitDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLatestSubmitDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetLatestSubmitDetailResponseBody</p>
     */
    public static class SubmitObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        private SubmitObject(Builder builder) {
            this.objectId = builder.objectId;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitObject create() {
            return builder().build();
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

        public static final class Builder {
            private String objectId; 
            private String objectName; 
            private String objectType; 

            /**
             * ObjectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * ObjectName.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public SubmitObject build() {
                return new SubmitObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLatestSubmitDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetLatestSubmitDetailResponseBody</p>
     */
    public static class ReleaseObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ObjectVersion")
        private String objectVersion;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SubmitComment")
        private String submitComment;

        @com.aliyun.core.annotation.NameInMap("SubmitObject")
        private SubmitObject submitObject;

        private ReleaseObject(Builder builder) {
            this.changeType = builder.changeType;
            this.nodeId = builder.nodeId;
            this.objectVersion = builder.objectVersion;
            this.projectId = builder.projectId;
            this.submitComment = builder.submitComment;
            this.submitObject = builder.submitObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleaseObject create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return objectVersion
         */
        public String getObjectVersion() {
            return this.objectVersion;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return submitComment
         */
        public String getSubmitComment() {
            return this.submitComment;
        }

        /**
         * @return submitObject
         */
        public SubmitObject getSubmitObject() {
            return this.submitObject;
        }

        public static final class Builder {
            private String changeType; 
            private String nodeId; 
            private String objectVersion; 
            private Long projectId; 
            private String submitComment; 
            private SubmitObject submitObject; 

            /**
             * ChangeType.
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * ObjectVersion.
             */
            public Builder objectVersion(String objectVersion) {
                this.objectVersion = objectVersion;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SubmitComment.
             */
            public Builder submitComment(String submitComment) {
                this.submitComment = submitComment;
                return this;
            }

            /**
             * SubmitObject.
             */
            public Builder submitObject(SubmitObject submitObject) {
                this.submitObject = submitObject;
                return this;
            }

            public ReleaseObject build() {
                return new ReleaseObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLatestSubmitDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetLatestSubmitDetailResponseBody</p>
     */
    public static class SubmitDetailResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("ReleaseObject")
        private ReleaseObject releaseObject;

        @com.aliyun.core.annotation.NameInMap("SubmitStatus")
        private String submitStatus;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private SubmitDetailResult(Builder builder) {
            this.id = builder.id;
            this.publishStatus = builder.publishStatus;
            this.releaseObject = builder.releaseObject;
            this.submitStatus = builder.submitStatus;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitDetailResult create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return releaseObject
         */
        public ReleaseObject getReleaseObject() {
            return this.releaseObject;
        }

        /**
         * @return submitStatus
         */
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Long id; 
            private String publishStatus; 
            private ReleaseObject releaseObject; 
            private String submitStatus; 
            private String tag; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * PublishStatus.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * ReleaseObject.
             */
            public Builder releaseObject(ReleaseObject releaseObject) {
                this.releaseObject = releaseObject;
                return this;
            }

            /**
             * SubmitStatus.
             */
            public Builder submitStatus(String submitStatus) {
                this.submitStatus = submitStatus;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public SubmitDetailResult build() {
                return new SubmitDetailResult(this);
            } 

        } 

    }
}
