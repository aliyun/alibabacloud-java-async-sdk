// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLockResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLockResponseBody</p>
 */
public class CreateLockResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LockStatus")
    private LockStatus lockStatus;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateLockResponseBody(Builder builder) {
        this.code = builder.code;
        this.lockStatus = builder.lockStatus;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLockResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return lockStatus
     */
    public LockStatus getLockStatus() {
        return this.lockStatus;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private LockStatus lockStatus; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LockStatus.
         */
        public Builder lockStatus(LockStatus lockStatus) {
            this.lockStatus = lockStatus;
            return this;
        }

        /**
         * Message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateLockResponseBody build() {
            return new CreateLockResponseBody(this);
        } 

    } 

}
