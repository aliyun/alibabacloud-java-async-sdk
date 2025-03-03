// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link DeleteTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTargetsResponseBody</p>
 */
public class DeleteTargetsResponseBody extends TeaModel {
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
         * <p>The response code. The code 200 indicates that the request was successful. Other codes indicate that the request failed. For information about error codes, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBusNotExist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>78FA9EAC-F0C0-58B0-871E-9F9756CE1D29</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteTargetsResponseBody build() {
            return new DeleteTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteTargetsResponseBody</p>
     */
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
             * <p>The ID of the event body that failed to be processed.</p>
             * 
             * <strong>example:</strong>
             * <p>target5</p>
             */
            public Builder entryId(String entryId) {
                this.entryId = entryId;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>EventRuleTargetIdDuplicate</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The id of event target is duplicate!</p>
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
    /**
     * 
     * {@link DeleteTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteTargetsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorEntries")
        private java.util.List<ErrorEntries> errorEntries;

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
        public java.util.List<ErrorEntries> getErrorEntries() {
            return this.errorEntries;
        }

        /**
         * @return errorEntriesCount
         */
        public Integer getErrorEntriesCount() {
            return this.errorEntriesCount;
        }

        public static final class Builder {
            private java.util.List<ErrorEntries> errorEntries; 
            private Integer errorEntriesCount; 

            /**
             * <p>The information about the event body that failed to be processed.</p>
             */
            public Builder errorEntries(java.util.List<ErrorEntries> errorEntries) {
                this.errorEntries = errorEntries;
                return this;
            }

            /**
             * <p>The number of event bodies that failed to be processed. Valid values: 0: No event bodies failed to be processed. An integer other than 0: the number of event bodies that failed to be processed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
