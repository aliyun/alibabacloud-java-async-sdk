// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link CommitContactFlowVersionModificationResponseBody} extends {@link TeaModel}
 *
 * <p>CommitContactFlowVersionModificationResponseBody</p>
 */
public class CommitContactFlowVersionModificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ContactFlowVersion")
    private ContactFlowVersion contactFlowVersion;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CommitContactFlowVersionModificationResponseBody(Builder builder) {
        this.code = builder.code;
        this.contactFlowVersion = builder.contactFlowVersion;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitContactFlowVersionModificationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contactFlowVersion
     */
    public ContactFlowVersion getContactFlowVersion() {
        return this.contactFlowVersion;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private ContactFlowVersion contactFlowVersion; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CommitContactFlowVersionModificationResponseBody model) {
            this.code = model.code;
            this.contactFlowVersion = model.contactFlowVersion;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ContactFlowVersion.
         */
        public Builder contactFlowVersion(ContactFlowVersion contactFlowVersion) {
            this.contactFlowVersion = contactFlowVersion;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CommitContactFlowVersionModificationResponseBody build() {
            return new CommitContactFlowVersionModificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CommitContactFlowVersionModificationResponseBody} extends {@link TeaModel}
     *
     * <p>CommitContactFlowVersionModificationResponseBody</p>
     */
    public static class ContactFlowVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Canvas")
        private String canvas;

        @com.aliyun.core.annotation.NameInMap("ContactFlowVersionDescription")
        private String contactFlowVersionDescription;

        @com.aliyun.core.annotation.NameInMap("ContactFlowVersionId")
        private String contactFlowVersionId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("LastModifiedBy")
        private String lastModifiedBy;

        @com.aliyun.core.annotation.NameInMap("LockedBy")
        private String lockedBy;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private ContactFlowVersion(Builder builder) {
            this.canvas = builder.canvas;
            this.contactFlowVersionDescription = builder.contactFlowVersionDescription;
            this.contactFlowVersionId = builder.contactFlowVersionId;
            this.content = builder.content;
            this.lastModified = builder.lastModified;
            this.lastModifiedBy = builder.lastModifiedBy;
            this.lockedBy = builder.lockedBy;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactFlowVersion create() {
            return builder().build();
        }

        /**
         * @return canvas
         */
        public String getCanvas() {
            return this.canvas;
        }

        /**
         * @return contactFlowVersionDescription
         */
        public String getContactFlowVersionDescription() {
            return this.contactFlowVersionDescription;
        }

        /**
         * @return contactFlowVersionId
         */
        public String getContactFlowVersionId() {
            return this.contactFlowVersionId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return lastModifiedBy
         */
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        /**
         * @return lockedBy
         */
        public String getLockedBy() {
            return this.lockedBy;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String canvas; 
            private String contactFlowVersionDescription; 
            private String contactFlowVersionId; 
            private String content; 
            private String lastModified; 
            private String lastModifiedBy; 
            private String lockedBy; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(ContactFlowVersion model) {
                this.canvas = model.canvas;
                this.contactFlowVersionDescription = model.contactFlowVersionDescription;
                this.contactFlowVersionId = model.contactFlowVersionId;
                this.content = model.content;
                this.lastModified = model.lastModified;
                this.lastModifiedBy = model.lastModifiedBy;
                this.lockedBy = model.lockedBy;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * Canvas.
             */
            public Builder canvas(String canvas) {
                this.canvas = canvas;
                return this;
            }

            /**
             * ContactFlowVersionDescription.
             */
            public Builder contactFlowVersionDescription(String contactFlowVersionDescription) {
                this.contactFlowVersionDescription = contactFlowVersionDescription;
                return this;
            }

            /**
             * ContactFlowVersionId.
             */
            public Builder contactFlowVersionId(String contactFlowVersionId) {
                this.contactFlowVersionId = contactFlowVersionId;
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
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * LastModifiedBy.
             */
            public Builder lastModifiedBy(String lastModifiedBy) {
                this.lastModifiedBy = lastModifiedBy;
                return this;
            }

            /**
             * LockedBy.
             */
            public Builder lockedBy(String lockedBy) {
                this.lockedBy = lockedBy;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ContactFlowVersion build() {
                return new ContactFlowVersion(this);
            } 

        } 

    }
}
