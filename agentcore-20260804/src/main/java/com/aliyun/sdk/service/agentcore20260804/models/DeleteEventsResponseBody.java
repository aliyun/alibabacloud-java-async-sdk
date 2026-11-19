// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link DeleteEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEventsResponseBody</p>
 */
public class DeleteEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DeleteEventsResponseBody(Builder builder) {
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

    public static DeleteEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteEventsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business result code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The operation result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The description of the request processing result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. For batch operations, you must still check the result of each item.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteEventsResponseBody build() {
            return new DeleteEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteEventsResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        @com.aliyun.core.annotation.Validation(required = true)
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The error code.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error description.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>The event content format is incorrect</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteEventsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("eventId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        private Results(Builder builder) {
            this.error = builder.error;
            this.eventId = builder.eventId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Error error; 
            private String eventId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.error = model.error;
                this.eventId = model.eventId;
                this.status = model.status;
            } 

            /**
             * <p>The error for the failed item.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The ID of the event requested to be deleted.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>evt-2f5f9c5a8d0e4c3b</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The status. Valid values: DELETED, NOT_FOUND, and FAILED.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DELETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("results")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Results> results;

        private Data(Builder builder) {
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        public static final class Builder {
            private java.util.List<Results> results; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.results = model.results;
            } 

            /**
             * <p>The itemized deletion results.</p>
             * <p>This parameter is required.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
