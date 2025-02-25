// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialLogNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHpoTrialLogNamesResponseBody</p>
 */
public class ListHpoTrialLogNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @com.aliyun.core.annotation.NameInMap("LogNames")
    private java.util.List < String > logNames;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListHpoTrialLogNamesResponseBody(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.logNames = builder.logNames;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHpoTrialLogNamesResponseBody create() {
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
     * @return logNames
     */
    public java.util.List < String > getLogNames() {
        return this.logNames;
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

    public static final class Builder {
        private String code; 
        private java.util.Map < String, String > detail; 
        private java.util.List < String > logNames; 
        private String message; 
        private String requestId; 

        /**
         * Error code.
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
         * Existing log files.
         */
        public Builder logNames(java.util.List < String > logNames) {
            this.logNames = logNames;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHpoTrialLogNamesResponseBody build() {
            return new ListHpoTrialLogNamesResponseBody(this);
        } 

    } 

}
