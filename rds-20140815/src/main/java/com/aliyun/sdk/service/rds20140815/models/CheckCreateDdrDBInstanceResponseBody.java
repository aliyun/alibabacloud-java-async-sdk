// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCreateDdrDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCreateDdrDBInstanceResponseBody</p>
 */
public class CheckCreateDdrDBInstanceResponseBody extends TeaModel {
    @NameInMap("IsValid")
    private String isValid;

    @NameInMap("RequestId")
    private String requestId;

    private CheckCreateDdrDBInstanceResponseBody(Builder builder) {
        this.isValid = builder.isValid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCreateDdrDBInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return isValid
     */
    public String getIsValid() {
        return this.isValid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String isValid; 
        private String requestId; 

        /**
         * IsValid.
         */
        public Builder isValid(String isValid) {
            this.isValid = isValid;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCreateDdrDBInstanceResponseBody build() {
            return new CheckCreateDdrDBInstanceResponseBody(this);
        } 

    } 

}
