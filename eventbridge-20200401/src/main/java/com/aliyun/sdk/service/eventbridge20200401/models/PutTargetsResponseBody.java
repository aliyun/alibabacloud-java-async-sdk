// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link PutTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>PutTargetsResponseBody</p>
 */
public class PutTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PutTargetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutTargetsResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code. Valid values:
         * <p>
         * 
         * *   Success: The call succeeded.
         * *   Other codes: The call failed. For more information about error codes, see Error codes.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned if the request failed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request is successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutTargetsResponseBody build() {
            return new PutTargetsResponseBody(this);
        } 

    } 

    public static class ErrorEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntryId")
        private String entryId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private ErrorEntries(Builder builder) {
            this.entryId = builder.entryId;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorEntries create() {
            return builder().build();
        }

        /**
         * @return entryId
         */
        public String getEntryId() {
            return this.entryId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String entryId; 
            private String errorCode; 
            private String errorMessage; 

            /**
             * The ID of the failed event target.
             */
            public Builder entryId(String entryId) {
                this.entryId = entryId;
                return this;
            }

            /**
             * The error code returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public ErrorEntries build() {
                return new ErrorEntries(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorEntries")
        private java.util.List < ErrorEntries> errorEntries;

        @com.aliyun.core.annotation.NameInMap("ErrorEntriesCount")
        private Integer errorEntriesCount;

        private Data(Builder builder) {
            this.errorEntries = builder.errorEntries;
            this.errorEntriesCount = builder.errorEntriesCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorEntries
         */
        public java.util.List < ErrorEntries> getErrorEntries() {
            return this.errorEntries;
        }

        /**
         * @return errorEntriesCount
         */
        public Integer getErrorEntriesCount() {
            return this.errorEntriesCount;
        }

        public static final class Builder {
            private java.util.List < ErrorEntries> errorEntries; 
            private Integer errorEntriesCount; 

            /**
             * The ID of the failed event target.
             */
            public Builder errorEntries(java.util.List < ErrorEntries> errorEntries) {
                this.errorEntries = errorEntries;
                return this;
            }

            /**
             * The number of failed event targets. Valid values:
             * <p>
             * 
             * *   0: All event targets succeeded.
             * *   An integer other than 0: indicates the number of failed event targets.
             */
            public Builder errorEntriesCount(Integer errorEntriesCount) {
                this.errorEntriesCount = errorEntriesCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
