// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckRecoveryConditionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckRecoveryConditionResponseBody</p>
 */
public class CheckRecoveryConditionResponseBody extends TeaModel {
    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("IsValid")
    private Boolean isValid;

    @NameInMap("RequestId")
    private String requestId;

    private CheckRecoveryConditionResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.isValid = builder.isValid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRecoveryConditionResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return isValid
     */
    public Boolean getIsValid() {
        return this.isValid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private Boolean isValid; 
        private String requestId; 

        /**
         * The instance ID
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * Indicates whether the data of the instance can be restored. Valid values:
         * <p>
         * 
         * *   **true**: The data of the instance can be restored.
         * *   **false**: The data of the instance cannot be restored.
         */
        public Builder isValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckRecoveryConditionResponseBody build() {
            return new CheckRecoveryConditionResponseBody(this);
        } 

    } 

}
