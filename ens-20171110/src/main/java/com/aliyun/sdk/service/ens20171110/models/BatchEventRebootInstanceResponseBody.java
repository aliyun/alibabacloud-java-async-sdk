// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link BatchEventRebootInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchEventRebootInstanceResponseBody</p>
 */
public class BatchEventRebootInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private BatchEventRebootInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEventRebootInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(BatchEventRebootInstanceResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>Id of the request。</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public BatchEventRebootInstanceResponseBody build() {
            return new BatchEventRebootInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchEventRebootInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchEventRebootInstanceResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private Results(Builder builder) {
            this.code = builder.code;
            this.eventId = builder.eventId;
            this.message = builder.message;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private Integer code; 
            private String eventId; 
            private String message; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.code = model.code;
                this.eventId = model.eventId;
                this.message = model.message;
                this.resourceId = model.resourceId;
            } 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
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
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
