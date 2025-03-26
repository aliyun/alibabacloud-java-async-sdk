// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CheckCreateDdrDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCreateDdrDBInstanceResponseBody</p>
 */
public class CheckCreateDdrDBInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsValid")
    private String isValid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckCreateDdrDBInstanceResponseBody model) {
            this.isValid = model.isValid;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the data of the source instance can be restored across regions. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isValid(String isValid) {
            this.isValid = isValid;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
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
