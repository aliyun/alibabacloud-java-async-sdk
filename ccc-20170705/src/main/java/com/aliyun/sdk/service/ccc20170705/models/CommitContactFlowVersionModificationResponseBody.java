// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitContactFlowVersionModificationResponseBody} extends {@link TeaModel}
 *
 * <p>CommitContactFlowVersionModificationResponseBody</p>
 */
public class CommitContactFlowVersionModificationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ContactFlowVersion")
    private ContactFlowVersion contactFlowVersion;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class ContactFlowVersion extends TeaModel {
        @NameInMap("Canvas")
        private String canvas;

        @NameInMap("ContactFlowVersionDescription")
        private String contactFlowVersionDescription;

        @NameInMap("ContactFlowVersionId")
        private String contactFlowVersionId;

        @NameInMap("Content")
        private String content;

        @NameInMap("LastModified")
        private String lastModified;

        @NameInMap("LastModifiedBy")
        private String lastModifiedBy;

        @NameInMap("LockedBy")
        private String lockedBy;

        @NameInMap("Status")
        private String status;

        @NameInMap("Version")
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
