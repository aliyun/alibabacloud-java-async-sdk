// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchUnbindPurchasedDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchUnbindPurchasedDevicesResponseBody</p>
 */
public class BatchUnbindPurchasedDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private BatchUnbindPurchasedDevicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUnbindPurchasedDevicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(BatchUnbindPurchasedDevicesResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public BatchUnbindPurchasedDevicesResponseBody build() {
            return new BatchUnbindPurchasedDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchUnbindPurchasedDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchUnbindPurchasedDevicesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        private Results(Builder builder) {
            this.deviceId = builder.deviceId;
            this.error = builder.error;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        public static final class Builder {
            private String deviceId; 
            private String error; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.deviceId = model.deviceId;
                this.error = model.error;
            } 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
