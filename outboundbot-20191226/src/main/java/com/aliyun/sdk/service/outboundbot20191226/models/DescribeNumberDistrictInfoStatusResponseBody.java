// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNumberDistrictInfoStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNumberDistrictInfoStatusResponseBody</p>
 */
public class DescribeNumberDistrictInfoStatusResponseBody extends TeaModel {
    @NameInMap("AppliedVersion")
    private AppliedVersion appliedVersion;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("ParsingVersion")
    private ParsingVersion parsingVersion;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
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

        /**
         * 已生效的号码库版本信息
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
         * 正在解析的号码库
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
         * 号码库状态
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

    public static class AppliedVersion extends TeaModel {
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileSize")
        private Long fileSize;

        @NameInMap("VersionId")
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

            /**
             * 号码库文件名
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * 号码库文件大小
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * 版本ID
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
    public static class ParsingVersion extends TeaModel {
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileSize")
        private Long fileSize;

        @NameInMap("ParseProgress")
        private Long parseProgress;

        @NameInMap("VersionId")
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

            /**
             * 号码库文件名
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * 号码库文件大小
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * 号码库解析进度
             */
            public Builder parseProgress(Long parseProgress) {
                this.parseProgress = parseProgress;
                return this;
            }

            /**
             * 版本ID
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
