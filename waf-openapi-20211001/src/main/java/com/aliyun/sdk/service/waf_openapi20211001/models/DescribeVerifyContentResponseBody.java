// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeVerifyContentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyContentResponseBody</p>
 */
public class DescribeVerifyContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DnsContent")
    private DnsContent dnsContent;

    @com.aliyun.core.annotation.NameInMap("FileContent")
    private FileContent fileContent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VerifyResult")
    private Boolean verifyResult;

    private DescribeVerifyContentResponseBody(Builder builder) {
        this.dnsContent = builder.dnsContent;
        this.fileContent = builder.fileContent;
        this.requestId = builder.requestId;
        this.verifyResult = builder.verifyResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyContentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnsContent
     */
    public DnsContent getDnsContent() {
        return this.dnsContent;
    }

    /**
     * @return fileContent
     */
    public FileContent getFileContent() {
        return this.fileContent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return verifyResult
     */
    public Boolean getVerifyResult() {
        return this.verifyResult;
    }

    public static final class Builder {
        private DnsContent dnsContent; 
        private FileContent fileContent; 
        private String requestId; 
        private Boolean verifyResult; 

        private Builder() {
        } 

        private Builder(DescribeVerifyContentResponseBody model) {
            this.dnsContent = model.dnsContent;
            this.fileContent = model.fileContent;
            this.requestId = model.requestId;
            this.verifyResult = model.verifyResult;
        } 

        /**
         * DnsContent.
         */
        public Builder dnsContent(DnsContent dnsContent) {
            this.dnsContent = dnsContent;
            return this;
        }

        /**
         * FileContent.
         */
        public Builder fileContent(FileContent fileContent) {
            this.fileContent = fileContent;
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
         * VerifyResult.
         */
        public Builder verifyResult(Boolean verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }

        public DescribeVerifyContentResponseBody build() {
            return new DescribeVerifyContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyContentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyContentResponseBody</p>
     */
    public static class DnsContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RR")
        private String rr;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DnsContent(Builder builder) {
            this.rr = builder.rr;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsContent create() {
            return builder().build();
        }

        /**
         * @return rr
         */
        public String getRr() {
            return this.rr;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String rr; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(DnsContent model) {
                this.rr = model.rr;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * RR.
             */
            public Builder rr(String rr) {
                this.rr = rr;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DnsContent build() {
                return new DnsContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyContentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyContentResponseBody</p>
     */
    public static class FileContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("TopDomain")
        private String topDomain;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("VerifyPath")
        private String verifyPath;

        private FileContent(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.fileName = builder.fileName;
            this.topDomain = builder.topDomain;
            this.value = builder.value;
            this.verifyPath = builder.verifyPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileContent create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return topDomain
         */
        public String getTopDomain() {
            return this.topDomain;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return verifyPath
         */
        public String getVerifyPath() {
            return this.verifyPath;
        }

        public static final class Builder {
            private String downloadUrl; 
            private String fileName; 
            private String topDomain; 
            private String value; 
            private String verifyPath; 

            private Builder() {
            } 

            private Builder(FileContent model) {
                this.downloadUrl = model.downloadUrl;
                this.fileName = model.fileName;
                this.topDomain = model.topDomain;
                this.value = model.value;
                this.verifyPath = model.verifyPath;
            } 

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
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
             * TopDomain.
             */
            public Builder topDomain(String topDomain) {
                this.topDomain = topDomain;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * VerifyPath.
             */
            public Builder verifyPath(String verifyPath) {
                this.verifyPath = verifyPath;
                return this;
            }

            public FileContent build() {
                return new FileContent(this);
            } 

        } 

    }
}
