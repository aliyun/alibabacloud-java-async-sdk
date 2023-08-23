// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDeviceStatusWithAkResponseBody} extends {@link TeaModel}
 *
 * <p>SyncDeviceStatusWithAkResponseBody</p>
 */
public class SyncDeviceStatusWithAkResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("Result")
    private Boolean result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    @NameInMap("requestId")
    private String requestId;

    private SyncDeviceStatusWithAkResponseBody(Builder builder) {
        this.message = builder.message;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDeviceStatusWithAkResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String message; 
        private Boolean result; 
        private Integer statusCode; 
        private String requestId; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SyncDeviceStatusWithAkResponseBody build() {
            return new SyncDeviceStatusWithAkResponseBody(this);
        } 

    } 

}
