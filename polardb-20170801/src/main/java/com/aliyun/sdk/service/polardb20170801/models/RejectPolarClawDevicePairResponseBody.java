// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RejectPolarClawDevicePairResponseBody} extends {@link TeaModel}
 *
 * <p>RejectPolarClawDevicePairResponseBody</p>
 */
public class RejectPolarClawDevicePairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PairRequestId")
    private String pairRequestId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RejectPolarClawDevicePairResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.deviceId = builder.deviceId;
        this.message = builder.message;
        this.pairRequestId = builder.pairRequestId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectPolarClawDevicePairResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pairRequestId
     */
    public String getPairRequestId() {
        return this.pairRequestId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private String deviceId; 
        private String message; 
        private String pairRequestId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RejectPolarClawDevicePairResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.deviceId = model.deviceId;
            this.message = model.message;
            this.pairRequestId = model.pairRequestId;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PairRequestId.
         */
        public Builder pairRequestId(String pairRequestId) {
            this.pairRequestId = pairRequestId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RejectPolarClawDevicePairResponseBody build() {
            return new RejectPolarClawDevicePairResponseBody(this);
        } 

    } 

}
