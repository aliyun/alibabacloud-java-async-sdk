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

        private Builder(BatchBindPurchasedDevicesResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of results.</p>
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

            private Builder() {
            } 

            private Builder(Results model) {
                this.deviceId = model.deviceId;
                this.error = model.error;
                this.groupId = model.groupId;
                this.region = model.region;
            } 

            /**
             * <p>The ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>348*****380-cn-qingdao</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The error message for the device. This parameter is returned only when an error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>some error</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>Space ID.</p>
             * 
             * <strong>example:</strong>
             * <p>238*****380-cn-qingdao</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
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
