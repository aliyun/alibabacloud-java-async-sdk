// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartHpoTrialsResponseBody} extends {@link TeaModel}
 *
 * <p>RestartHpoTrialsResponseBody</p>
 */
public class RestartHpoTrialsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(java.util.Map < String, String > detail) {
            this.detail = detail;
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
         * Results.
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
