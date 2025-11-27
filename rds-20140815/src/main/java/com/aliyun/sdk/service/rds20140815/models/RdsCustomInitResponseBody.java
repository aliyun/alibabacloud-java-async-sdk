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
 * {@link RdsCustomInitResponseBody} extends {@link TeaModel}
 *
 * <p>RdsCustomInitResponseBody</p>
 */
public class RdsCustomInitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegisterUidSuccess")
    private Boolean registerUidSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RdsCustomInitResponseBody(Builder builder) {
        this.registerUidSuccess = builder.registerUidSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RdsCustomInitResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registerUidSuccess
     */
    public Boolean getRegisterUidSuccess() {
        return this.registerUidSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean registerUidSuccess; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RdsCustomInitResponseBody model) {
            this.registerUidSuccess = model.registerUidSuccess;
            this.requestId = model.requestId;
        } 

        /**
         * RegisterUidSuccess.
         */
        public Builder registerUidSuccess(Boolean registerUidSuccess) {
            this.registerUidSuccess = registerUidSuccess;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RdsCustomInitResponseBody build() {
            return new RdsCustomInitResponseBody(this);
        } 

    } 

}
