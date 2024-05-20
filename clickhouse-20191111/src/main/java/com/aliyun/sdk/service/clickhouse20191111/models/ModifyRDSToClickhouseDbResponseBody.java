// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRDSToClickhouseDbResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRDSToClickhouseDbResponseBody</p>
 */
public class ModifyRDSToClickhouseDbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Long errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    private ModifyRDSToClickhouseDbResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRDSToClickhouseDbResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Long getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Long status; 

        /**
         * The error code.
         */
        public Builder errorCode(Long errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * *   If the value **1** is returned for the **Status** parameter, the system does not return the ErrorMsg parameter.
         * <p>
         * *   If the value **0** is returned for the **Status** parameter, the ErrorMsg parameter returns the cause for the modification failure.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the modification was successful. Valid values:
         * <p>
         * 
         * *   **1**: The modification was successful.
         * *   **0**: The modification failed.
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        public ModifyRDSToClickhouseDbResponseBody build() {
            return new ModifyRDSToClickhouseDbResponseBody(this);
        } 

    } 

}
