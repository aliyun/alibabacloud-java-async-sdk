// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFileDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileDetectResultResponseBody</p>
 */
public class GetFileDetectResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultList")
    private java.util.List < ResultList> resultList;

    private GetFileDetectResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultList = builder.resultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultList
     */
    public java.util.List < ResultList> getResultList() {
        return this.resultList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultList> resultList; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of file detection results.</p>
         */
        public Builder resultList(java.util.List < ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public GetFileDetectResultResponseBody build() {
            return new GetFileDetectResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileDetectResultResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Compress")
        private Boolean compress;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("HashKey")
        private String hashKey;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Integer result;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("VirusType")
        private String virusType;

        private ResultList(Builder builder) {
            this.code = builder.code;
            this.compress = builder.compress;
            this.ext = builder.ext;
            this.hashKey = builder.hashKey;
            this.message = builder.message;
            this.result = builder.result;
            this.score = builder.score;
            this.virusType = builder.virusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return compress
         */
        public Boolean getCompress() {
            return this.compress;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return hashKey
         */
        public String getHashKey() {
            return this.hashKey;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return virusType
         */
        public String getVirusType() {
            return this.virusType;
        }

        public static final class Builder {
            private String code; 
            private Boolean compress; 
            private String ext; 
            private String hashKey; 
            private String message; 
            private Integer result; 
            private Integer score; 
            private String virusType; 

            /**
             * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Whether to identify as a compressed package. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder compress(Boolean compress) {
                this.compress = compress;
                return this;
            }

            /**
             * <p>The extended information about the file detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;HighLight&quot;:[[23245,23212]]}</p>
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The identifier of the file. Only MD5 hash values are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0a212417e65c26ff133cfff28f6c****</p>
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The file detection result. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The file is normal.</li>
             * <li><strong>1</strong>: The file is suspicious.</li>
             * <li><strong>3</strong>: The detection is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The score of file detection result.</p>
             * <blockquote>
             * <p>A higher score indicates a more suspicious file.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The type of the virus. Valid values:</p>
             * <ul>
             * <li><strong>Trojan</strong>: trojan horse</li>
             * <li><strong>WebShell</strong>: webshell</li>
             * <li><strong>Backdoor</strong>: backdoor program</li>
             * <li><strong>RansomWare</strong>: ransomware</li>
             * <li><strong>Scanner</strong>: scanner</li>
             * <li><strong>Stealer</strong>: tool that is used to steal information</li>
             * <li><strong>Malbaseware</strong>: tainted basic software</li>
             * <li><strong>Hacktool</strong>: attacker tool</li>
             * <li><strong>Engtest</strong>: engine test program</li>
             * <li><strong>Downloader</strong>: trojan downloader</li>
             * <li><strong>Virus</strong>: infectious virus</li>
             * <li><strong>Miner</strong>: mining program</li>
             * <li><strong>Worm</strong>: worm</li>
             * <li><strong>DDoS</strong>: DDoS trojan</li>
             * <li><strong>Malware</strong>: malicious program</li>
             * <li><strong>RiskWare</strong>: software that has risks</li>
             * <li><strong>Proxytool</strong>: proxy</li>
             * <li><strong>Suspicious</strong>: suspicious program</li>
             * <li><strong>MalScript</strong>: malicious script</li>
             * <li><strong>Rootkit</strong>: rootkit</li>
             * <li><strong>Exploit</strong>: exploit</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WEBSHELL</p>
             */
            public Builder virusType(String virusType) {
                this.virusType = virusType;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
}
