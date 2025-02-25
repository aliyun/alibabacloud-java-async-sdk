// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopHpoExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>StopHpoExperimentResponseBody</p>
 */
public class StopHpoExperimentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @com.aliyun.core.annotation.NameInMap("ExpId")
    private String expId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private StopHpoExperimentResponseBody(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.expId = builder.expId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopHpoExperimentResponseBody create() {
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
     * @return expId
     */
    public String getExpId() {
        return this.expId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map < String, String > detail; 
        private String expId; 
        private String message; 
        private String requestId; 
        private String status; 

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
         * Experiment ID
         */
        public Builder expId(String expId) {
            this.expId = expId;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public StopHpoExperimentResponseBody build() {
            return new StopHpoExperimentResponseBody(this);
        } 

    } 

}
