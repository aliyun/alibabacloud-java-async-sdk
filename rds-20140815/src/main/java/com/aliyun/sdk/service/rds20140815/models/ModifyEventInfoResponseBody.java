// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyEventInfoResponseBody</p>
 */
public class ModifyEventInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorEventId")
    private String errorEventId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessCount")
    private Integer successCount;

    @NameInMap("SuccessEventId")
    private String successEventId;

    private ModifyEventInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorEventId = builder.errorEventId;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.successEventId = builder.successEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEventInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorEventId
     */
    public String getErrorEventId() {
        return this.errorEventId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return successEventId
     */
    public String getSuccessEventId() {
        return this.successEventId;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorEventId; 
        private String requestId; 
        private Integer successCount; 
        private String successEventId; 

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Error eventId.
         */
        public Builder errorEventId(String errorEventId) {
            this.errorEventId = errorEventId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of devices that were created.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * Success eventId.
         */
        public Builder successEventId(String successEventId) {
            this.successEventId = successEventId;
            return this;
        }

        public ModifyEventInfoResponseBody build() {
            return new ModifyEventInfoResponseBody(this);
        } 

    } 

}
