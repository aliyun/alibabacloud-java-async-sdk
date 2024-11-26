// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
    private java.util.List < Result> result;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
        private Boolean success; 

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
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
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

            /**
             * AttachmentToken.
             */
            public Builder attachmentToken(String attachmentToken) {
                this.attachmentToken = attachmentToken;
                return this;
            }

            /**
             * AttachmentType.
             */
            public Builder attachmentType(String attachmentType) {
                this.attachmentType = attachmentType;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FileLink.
             */
            public Builder fileLink(String fileLink) {
                this.fileLink = fileLink;
                return this;
            }

            /**
             * FileLinkGmtExpired.
             */
            public Builder fileLinkGmtExpired(Long fileLinkGmtExpired) {
                this.fileLinkGmtExpired = fileLinkGmtExpired;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * FileSuffix.
             */
            public Builder fileSuffix(String fileSuffix) {
                this.fileSuffix = fileSuffix;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(Long operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * OperatorRole.
             */
            public Builder operatorRole(String operatorRole) {
                this.operatorRole = operatorRole;
                return this;
            }

            /**
             * StepNo.
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
