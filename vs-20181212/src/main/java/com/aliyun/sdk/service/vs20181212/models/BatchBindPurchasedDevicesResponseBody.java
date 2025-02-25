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
 * {@link BatchBindPurchasedDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchBindPurchasedDevicesResponseBody</p>
 */
public class BatchBindPurchasedDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private BatchBindPurchasedDevicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindPurchasedDevicesResponseBody create() {
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

        public BatchBindPurchasedDevicesResponseBody build() {
            return new BatchBindPurchasedDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchBindPurchasedDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchBindPurchasedDevicesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private Results(Builder builder) {
            this.deviceId = builder.deviceId;
            this.error = builder.error;
            this.groupId = builder.groupId;
            this.region = builder.region;
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
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String deviceId; 
            private String error; 
            private String groupId; 
            private String region; 

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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
