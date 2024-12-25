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
 * {@link BatchBindParentPlatformDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchBindParentPlatformDevicesResponseBody</p>
 */
public class BatchBindParentPlatformDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private BatchBindParentPlatformDevicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindParentPlatformDevicesResponseBody create() {
        return builder().build();
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

        public BatchBindParentPlatformDevicesResponseBody build() {
            return new BatchBindParentPlatformDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchBindParentPlatformDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchBindParentPlatformDevicesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("ParentPlatformId")
        private String parentPlatformId;

        private Results(Builder builder) {
            this.deviceId = builder.deviceId;
            this.error = builder.error;
            this.parentPlatformId = builder.parentPlatformId;
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

        /**
         * @return parentPlatformId
         */
        public String getParentPlatformId() {
            return this.parentPlatformId;
        }

        public static final class Builder {
            private String deviceId; 
            private String error; 
            private String parentPlatformId; 

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

            /**
             * ParentPlatformId.
             */
            public Builder parentPlatformId(String parentPlatformId) {
                this.parentPlatformId = parentPlatformId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
