// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeNumberDistrictInfoStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNumberDistrictInfoStatusResponseBody</p>
 */
public class DescribeNumberDistrictInfoStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppliedVersion")
    private AppliedVersion appliedVersion;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ParsingVersion")
    private ParsingVersion parsingVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeNumberDistrictInfoStatusResponseBody(Builder builder) {
        this.appliedVersion = builder.appliedVersion;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.parsingVersion = builder.parsingVersion;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNumberDistrictInfoStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appliedVersion
     */
    public AppliedVersion getAppliedVersion() {
        return this.appliedVersion;
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
     * @return parsingVersion
     */
    public ParsingVersion getParsingVersion() {
        return this.parsingVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AppliedVersion appliedVersion; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private ParsingVersion parsingVersion; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeNumberDistrictInfoStatusResponseBody model) {
            this.appliedVersion = model.appliedVersion;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.parsingVersion = model.parsingVersion;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * AppliedVersion.
         */
        public Builder appliedVersion(AppliedVersion appliedVersion) {
            this.appliedVersion = appliedVersion;
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
         * ParsingVersion.
         */
        public Builder parsingVersion(ParsingVersion parsingVersion) {
            this.parsingVersion = parsingVersion;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeNumberDistrictInfoStatusResponseBody build() {
            return new DescribeNumberDistrictInfoStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNumberDistrictInfoStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNumberDistrictInfoStatusResponseBody</p>
     */
    public static class AppliedVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private AppliedVersion(Builder builder) {
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppliedVersion create() {
            return builder().build();
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
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String fileName; 
            private Long fileSize; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(AppliedVersion model) {
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.versionId = model.versionId;
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
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public AppliedVersion build() {
                return new AppliedVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNumberDistrictInfoStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNumberDistrictInfoStatusResponseBody</p>
     */
    public static class ParsingVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("ParseProgress")
        private Long parseProgress;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private ParsingVersion(Builder builder) {
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.parseProgress = builder.parseProgress;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParsingVersion create() {
            return builder().build();
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
         * @return parseProgress
         */
        public Long getParseProgress() {
            return this.parseProgress;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String fileName; 
            private Long fileSize; 
            private Long parseProgress; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(ParsingVersion model) {
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.parseProgress = model.parseProgress;
                this.versionId = model.versionId;
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
             * ParseProgress.
             */
            public Builder parseProgress(Long parseProgress) {
                this.parseProgress = parseProgress;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public ParsingVersion build() {
                return new ParsingVersion(this);
            } 

        } 

    }
}
