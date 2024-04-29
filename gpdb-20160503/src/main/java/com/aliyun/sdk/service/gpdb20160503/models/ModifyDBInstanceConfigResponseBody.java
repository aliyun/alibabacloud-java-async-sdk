// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceConfigResponseBody</p>
 */
public class ModifyDBInstanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    private String dbInstanceId;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    private ModifyDBInstanceConfigResponseBody(Builder builder) {
        this.dbInstanceId = builder.dbInstanceId;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
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
        private String dbInstanceId; 
        private String errorMessage; 
        private String requestId; 
        private Boolean status; 

        /**
         * The ID of the instance.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * The error message returned if the operation fails.
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
         * The state of the operation. Valid values:
         * <p>
         * 
         * *   **0**: The operation failed.
         * *   **1**: The operation is successful.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public ModifyDBInstanceConfigResponseBody build() {
            return new ModifyDBInstanceConfigResponseBody(this);
        } 

    } 

}
