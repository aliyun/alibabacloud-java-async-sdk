// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListWorkitemAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkitemAttachmentsResponseBody</p>
 */
public class ListWorkitemAttachmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attachments")
    private java.util.List<Attachments> attachments;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListWorkitemAttachmentsResponseBody(Builder builder) {
        this.attachments = builder.attachments;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkitemAttachmentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return attachments
     */
    public java.util.List<Attachments> getAttachments() {
        return this.attachments;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Attachments> attachments; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * attachments.
         */
        public Builder attachments(java.util.List<Attachments> attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWorkitemAttachmentsResponseBody build() {
            return new ListWorkitemAttachmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkitemAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkitemAttachmentsResponseBody</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("fileIdentifier")
        private String fileIdentifier;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileSuffix")
        private String fileSuffix;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Attachments(Builder builder) {
            this.creator = builder.creator;
            this.fileIdentifier = builder.fileIdentifier;
            this.fileName = builder.fileName;
            this.fileSuffix = builder.fileSuffix;
            this.gmtCreate = builder.gmtCreate;
            this.size = builder.size;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return fileIdentifier
         */
        public String getFileIdentifier() {
            return this.fileIdentifier;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
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
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String creator; 
            private String fileIdentifier; 
            private String fileName; 
            private String fileSuffix; 
            private Long gmtCreate; 
            private String size; 
            private String url; 

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * fileIdentifier.
             */
            public Builder fileIdentifier(String fileIdentifier) {
                this.fileIdentifier = fileIdentifier;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileSuffix.
             */
            public Builder fileSuffix(String fileSuffix) {
                this.fileSuffix = fileSuffix;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
}
