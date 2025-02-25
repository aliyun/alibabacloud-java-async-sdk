// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetDetailByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetDetailByIdResponseBody</p>
 */
public class GetDetailByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDetailByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDetailByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Interface return code.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data query result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAB46EC5-3746-59C4-B6D2-469F442EC73F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Values: - <strong>true</strong>: indicates a successful call. - <strong>false</strong>: indicates a failed call.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDetailByIdResponseBody build() {
            return new GetDetailByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDetailByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetDetailByIdResponseBody</p>
     */
    public static class VulDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("CvssScore")
        private String cvssScore;

        @com.aliyun.core.annotation.NameInMap("FixSuggestion")
        private String fixSuggestion;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private VulDetails(Builder builder) {
            this.cveId = builder.cveId;
            this.cvssScore = builder.cvssScore;
            this.fixSuggestion = builder.fixSuggestion;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulDetails create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return cvssScore
         */
        public String getCvssScore() {
            return this.cvssScore;
        }

        /**
         * @return fixSuggestion
         */
        public String getFixSuggestion() {
            return this.fixSuggestion;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String cveId; 
            private String cvssScore; 
            private String fixSuggestion; 
            private String title; 

            /**
             * <p>CVE ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2022-21291</p>
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * <p>The CVSS score of the vulnerability in the Alibaba Cloud vulnerability database.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0</p>
             */
            public Builder cvssScore(String cvssScore) {
                this.cvssScore = cvssScore;
                return this;
            }

            /**
             * <p>Fix suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://avd.aliyun.com/detail/CVE-2022-21291">https://avd.aliyun.com/detail/CVE-2022-21291</a></p>
             */
            public Builder fixSuggestion(String fixSuggestion) {
                this.fixSuggestion = fixSuggestion;
                return this;
            }

            /**
             * <p>Title of the vulnerability announcement.</p>
             * 
             * <strong>example:</strong>
             * <p>Chanjet T-Plus SetupAccount/Upload. Aspx file upload vulnerability(CNVD-2022-60632)</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public VulDetails build() {
                return new VulDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDetailByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetDetailByIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VulDetails")
        private java.util.List<VulDetails> vulDetails;

        private Data(Builder builder) {
            this.vulDetails = builder.vulDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return vulDetails
         */
        public java.util.List<VulDetails> getVulDetails() {
            return this.vulDetails;
        }

        public static final class Builder {
            private java.util.List<VulDetails> vulDetails; 

            /**
             * <p>Vulnerability details.</p>
             */
            public Builder vulDetails(java.util.List<VulDetails> vulDetails) {
                this.vulDetails = vulDetails;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
