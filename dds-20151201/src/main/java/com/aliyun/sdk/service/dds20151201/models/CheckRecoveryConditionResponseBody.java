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
         * The ID of the request.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder isValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }

        /**
         * The ID of the resource group.
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
