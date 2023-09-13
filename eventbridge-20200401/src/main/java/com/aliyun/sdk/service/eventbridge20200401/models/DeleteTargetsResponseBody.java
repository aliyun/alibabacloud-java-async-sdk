// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link DeleteTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTargetsResponseBody</p>
 */
public class DeleteTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DeleteTargetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTargetsResponseBody create() {
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
         * The returned HTTP status code. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error message.
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
         * Indicates whether the operation is successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteTargetsResponseBody build() {
            return new DeleteTargetsResponseBody(this);
        } 

    } 

    public static class ErrorEntries extends TeaModel {
        @NameInMap("EntryId")
        private String entryId;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
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
             * The ID of the event body that failed to be processed.
             */
            public Builder entryId(String entryId) {
                this.entryId = entryId;
                return this;
            }

            /**
             * The returned error code.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The returned error message.
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
        @NameInMap("ErrorEntries")
        private java.util.List < ErrorEntries> errorEntries;

        @NameInMap("ErrorEntriesCount")
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
             * The information about the event body that failed to be processed.
             */
            public Builder errorEntries(java.util.List < ErrorEntries> errorEntries) {
                this.errorEntries = errorEntries;
                return this;
            }

            /**
             * The number of event bodies that failed to be processed. Valid values: 0: No event bodies failed to be processed. An integer other than 0: the number of event bodies that failed to be processed.
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
