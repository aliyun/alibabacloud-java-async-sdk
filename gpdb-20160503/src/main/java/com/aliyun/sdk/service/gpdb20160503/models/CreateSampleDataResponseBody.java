// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSampleDataResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSampleDataResponseBody</p>
 */
public class CreateSampleDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    private CreateSampleDataResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSampleDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String errorMessage; 
        private String requestId; 
        private Boolean status; 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The error message returned if an error occurs. This message does not affect the execution of the operation.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * The execution state of the operation. Valid values:
         * <p>
         * 
         * *   **false**: The operation fails.
         * *   **true**: The operation is successful.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public CreateSampleDataResponseBody build() {
            return new CreateSampleDataResponseBody(this);
        } 

    } 

}
