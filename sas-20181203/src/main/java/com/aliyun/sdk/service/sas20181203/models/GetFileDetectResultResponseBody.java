// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of file detection results.
         */
        public Builder resultList(java.util.List < ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public GetFileDetectResultResponseBody build() {
            return new GetFileDetectResultResponseBody(this);
        } 

    } 

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
             * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Whether to identify as a compressed package. Valid values:
             * <p>
             * - **true**: Yes.
             * - **false**: No.
             */
            public Builder compress(Boolean compress) {
                this.compress = compress;
                return this;
            }

            /**
             * The extended information about the file detection result.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * The identifier of the file. Only MD5 hash values are supported.
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The file detection result. Valid values:
             * <p>
             * 
             * *   **0**: The file is normal.
             * *   **1**: The file is suspicious.
             * *   **3**: The detection is in progress.
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            /**
             * The score of file detection result.
             * <p>
             * 
             * > A higher score indicates a more suspicious file.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * The type of the virus. Valid values:
             * <p>
             * 
             * *   **Trojan**: trojan horse
             * *   **WebShell**: webshell
             * *   **Backdoor**: backdoor program
             * *   **RansomWare**: ransomware
             * *   **Scanner**: scanner
             * *   **Stealer**: tool that is used to steal information
             * *   **Malbaseware**: tainted basic software
             * *   **Hacktool**: attacker tool
             * *   **Engtest**: engine test program
             * *   **Downloader**: trojan downloader
             * *   **Virus**: infectious virus
             * *   **Miner**: mining program
             * *   **Worm**: worm
             * *   **DDoS**: DDoS trojan
             * *   **Malware**: malicious program
             * *   **RiskWare**: software that has risks
             * *   **Proxytool**: proxy
             * *   **Suspicious**: suspicious program
             * *   **MalScript**: malicious script
             * *   **Rootkit**: rootkit
             * *   **Exploit**: exploit
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
