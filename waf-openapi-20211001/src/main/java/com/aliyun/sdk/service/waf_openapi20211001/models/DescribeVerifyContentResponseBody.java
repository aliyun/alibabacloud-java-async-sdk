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
         * <p>The DNS-based verification content, including the TXT record details.</p>
         */
        public Builder dnsContent(DnsContent dnsContent) {
            this.dnsContent = dnsContent;
            return this;
        }

        /**
         * <p>The file-based verification content, including the file name, path, and download URL.</p>
         */
        public Builder fileContent(FileContent fileContent) {
            this.fileContent = fileContent;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the domain ownership verification is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The host record of the DNS TXT record used for domain ownership verification.</p>
             * 
             * <strong>example:</strong>
             * <p>verification</p>
             */
            public Builder rr(String rr) {
                this.rr = rr;
                return this;
            }

            /**
             * <p>The type of the DNS record used for verification.</p>
             * 
             * <strong>example:</strong>
             * <p>TXT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the DNS TXT record used for verification.</p>
             * 
             * <strong>example:</strong>
             * <p>verify_0a246ca99d504ba087472d***</p>
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
             * <p>The download URL of the verification file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://oss.xxx.com//xxx.html">http://oss.xxx.com//xxx.html</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The name of the verification file.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.html</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The root domain of the domain name to be verified.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyundemo.com</p>
             */
            public Builder topDomain(String topDomain) {
                this.topDomain = topDomain;
                return this;
            }

            /**
             * <p>The content of the verification file.</p>
             * 
             * <strong>example:</strong>
             * <p>verify_0a246ca99d504ba08***</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The URL that is used to access the verification file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.xxx.com//xxx.html">http://xxx.xxx.com//xxx.html</a></p>
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
