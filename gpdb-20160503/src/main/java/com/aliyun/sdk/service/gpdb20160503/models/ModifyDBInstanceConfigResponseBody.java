// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyDBInstanceConfigResponseBody model) {
            this.dbInstanceId = model.dbInstanceId;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * <p>The error message returned if the operation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;error message&quot;</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>34B32A0A-08EF-4A87-B6BE-CDD9F56FC3AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the operation. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The operation failed.</li>
         * <li><strong>1</strong>: The operation is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
