// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartHpoTrialsResponseBody} extends {@link TeaModel}
 *
 * <p>RestartHpoTrialsResponseBody</p>
 */
public class RestartHpoTrialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.Map < String, ? > results;

    private RestartHpoTrialsResponseBody(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartHpoTrialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return detail
     */
    public java.util.Map < String, String > getDetail() {
        return this.detail;
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
     * @return results
     */
    public java.util.Map < String, ? > getResults() {
        return this.results;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map < String, String > detail; 
        private String message; 
        private String requestId; 
        private java.util.Map < String, ? > results; 

        /**
         * Response code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Extra error information.
         */
        public Builder detail(java.util.Map < String, String > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Restart status of all the trial IDs.
         */
        public Builder results(java.util.Map < String, ? > results) {
            this.results = results;
            return this;
        }

        public RestartHpoTrialsResponseBody build() {
            return new RestartHpoTrialsResponseBody(this);
        } 

    } 

}
