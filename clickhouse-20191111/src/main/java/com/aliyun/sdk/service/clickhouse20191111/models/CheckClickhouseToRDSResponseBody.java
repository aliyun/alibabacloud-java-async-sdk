// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckClickhouseToRDSResponseBody} extends {@link TeaModel}
 *
 * <p>CheckClickhouseToRDSResponseBody</p>
 */
public class CheckClickhouseToRDSResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Boolean status;

    private CheckClickhouseToRDSResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckClickhouseToRDSResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private String errorCode; 
        private String requestId; 
        private Boolean status; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public CheckClickhouseToRDSResponseBody build() {
            return new CheckClickhouseToRDSResponseBody(this);
        } 

    } 

}
