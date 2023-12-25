// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSyndbResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSyndbResponseBody</p>
 */
public class DeleteSyndbResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Long errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Boolean status;

    private DeleteSyndbResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSyndbResponseBody create() {
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
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean status; 

        /**
         * The error code.
         */
        public Builder errorCode(Long errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * *   If the value **true** is returned for the **Status** parameter, the system does not return the ErrorMsg parameter.
         * <p>
         * *   If the value **false** is returned for the **Status** parameter, the system returns the deletion failure cause for the ErrorMsg parameter.
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
         * Indicates whether the database used for data synchronization was deleted. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public DeleteSyndbResponseBody build() {
            return new DeleteSyndbResponseBody(this);
        } 

    } 

}
