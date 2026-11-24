// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeProjectAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectAttachmentsResponseBody</p>
 */
public class DescribeProjectAttachmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeProjectAttachmentsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectAttachmentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeProjectAttachmentsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>e03a9f78-7b40-4fb3-a015-350913e37e3f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of project attachments.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeProjectAttachmentsResponseBody build() {
            return new DescribeProjectAttachmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProjectAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectAttachmentsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentToken")
        private String attachmentToken;

        @com.aliyun.core.annotation.NameInMap("AttachmentType")
        private String attachmentType;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FileLink")
        private String fileLink;

        @com.aliyun.core.annotation.NameInMap("FileLinkGmtExpired")
        private Long fileLinkGmtExpired;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("FileSuffix")
        private String fileSuffix;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private Long operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("OperatorRole")
        private String operatorRole;

        @com.aliyun.core.annotation.NameInMap("StepNo")
        private Integer stepNo;

        private Result(Builder builder) {
            this.attachmentToken = builder.attachmentToken;
            this.attachmentType = builder.attachmentType;
            this.content = builder.content;
            this.fileLink = builder.fileLink;
            this.fileLinkGmtExpired = builder.fileLinkGmtExpired;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileSuffix = builder.fileSuffix;
            this.gmtCreate = builder.gmtCreate;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.operator = builder.operator;
            this.operatorName = builder.operatorName;
            this.operatorRole = builder.operatorRole;
            this.stepNo = builder.stepNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return attachmentToken
         */
        public String getAttachmentToken() {
            return this.attachmentToken;
        }

        /**
         * @return attachmentType
         */
        public String getAttachmentType() {
            return this.attachmentType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileLink
         */
        public String getFileLink() {
            return this.fileLink;
        }

        /**
         * @return fileLinkGmtExpired
         */
        public Long getFileLinkGmtExpired() {
            return this.fileLinkGmtExpired;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileSuffix
         */
        public String getFileSuffix() {
            return this.fileSuffix;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return operator
         */
        public Long getOperator() {
            return this.operator;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return operatorRole
         */
        public String getOperatorRole() {
            return this.operatorRole;
        }

        /**
         * @return stepNo
         */
        public Integer getStepNo() {
            return this.stepNo;
        }

        public static final class Builder {
            private String attachmentToken; 
            private String attachmentType; 
            private String content; 
            private String fileLink; 
            private Long fileLinkGmtExpired; 
            private String fileName; 
            private Long fileSize; 
            private String fileSuffix; 
            private Long gmtCreate; 
            private Long nodeId; 
            private String nodeName; 
            private Long operator; 
            private String operatorName; 
            private String operatorRole; 
            private Integer stepNo; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.attachmentToken = model.attachmentToken;
                this.attachmentType = model.attachmentType;
                this.content = model.content;
                this.fileLink = model.fileLink;
                this.fileLinkGmtExpired = model.fileLinkGmtExpired;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.fileSuffix = model.fileSuffix;
                this.gmtCreate = model.gmtCreate;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.operator = model.operator;
                this.operatorName = model.operatorName;
                this.operatorRole = model.operatorRole;
                this.stepNo = model.stepNo;
            } 

            /**
             * <p>The MD5 hash of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>Mzc4NDAtODQ3MjY4MzI=</p>
             */
            public Builder attachmentToken(String attachmentToken) {
                this.attachmentToken = attachmentToken;
                return this;
            }

            /**
             * <p>The type of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>File</p>
             */
            public Builder attachmentType(String attachmentType) {
                this.attachmentType = attachmentType;
                return this;
            }

            /**
             * <p>The content text.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The access URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://delivery-center.oss-cn-shanghai.aliyuncs.com/6a8****0e2/e0a***f3.jpg?Expires=1589334682&OSSAccessKeyId=wI2r*********&Signature=JWB39pUxs7RCqrcw58qXPEGu6M0%3D">http://delivery-center.oss-cn-shanghai.aliyuncs.com/6a8****0e2/e0a***f3.jpg?Expires=1589334682&amp;OSSAccessKeyId=wI2r*********&amp;Signature=JWB39pUxs7RCqrcw58qXPEGu6M0%3D</a></p>
             */
            public Builder fileLink(String fileLink) {
                this.fileLink = fileLink;
                return this;
            }

            /**
             * <p>The expiration time of the file URL (UNIX timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1589334682404</p>
             */
            public Builder fileLinkGmtExpired(Long fileLinkGmtExpired) {
                this.fileLinkGmtExpired = fileLinkGmtExpired;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>f8-test-perview.jpeg</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The size of the file (in bytes).</p>
             * 
             * <strong>example:</strong>
             * <p>109124</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The file name extension.</p>
             * 
             * <strong>example:</strong>
             * <p>jpg</p>
             */
            public Builder fileSuffix(String fileSuffix) {
                this.fileSuffix = fileSuffix;
                return this;
            }

            /**
             * <p>The time when the attachment was uploaded (UNIX timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1587968858000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the flow node where the attachment was uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p>8472</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Waiting for service activation</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>45261111****</p>
             */
            public Builder operator(Long operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>** Technology Co., Ltd</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The role of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>Provider</p>
             */
            public Builder operatorRole(String operatorRole) {
                this.operatorRole = operatorRole;
                return this;
            }

            /**
             * <p>The sequence number of the flow node.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder stepNo(Integer stepNo) {
                this.stepNo = stepNo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
