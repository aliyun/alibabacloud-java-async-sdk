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
         * ErrorCode.
         */
        public Builder errorCode(Long errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public DeleteSyndbResponseBody build() {
            return new DeleteSyndbResponseBody(this);
        } 

    } 

}
