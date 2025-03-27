// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link SyncDeviceStatusWithAkResponseBody} extends {@link TeaModel}
 *
 * <p>SyncDeviceStatusWithAkResponseBody</p>
 */
public class SyncDeviceStatusWithAkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SyncDeviceStatusWithAkResponseBody model) {
            this.message = model.message;
            this.result = model.result;
            this.statusCode = model.statusCode;
            this.requestId = model.requestId;
        } 

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
