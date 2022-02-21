// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesByAliasResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDevicesByAliasResponseBody</p>
 */
public class QueryDevicesByAliasResponseBody extends TeaModel {
    @NameInMap("DeviceIds")
    private DeviceIds deviceIds;

    @NameInMap("RequestId")
    private String requestId;

    private QueryDevicesByAliasResponseBody(Builder builder) {
        this.deviceIds = builder.deviceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicesByAliasResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceIds
     */
    public DeviceIds getDeviceIds() {
        return this.deviceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceIds deviceIds; 
        private String requestId; 

        /**
         * DeviceIds.
         */
        public Builder deviceIds(DeviceIds deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDevicesByAliasResponseBody build() {
            return new QueryDevicesByAliasResponseBody(this);
        } 

    } 

    public static class DeviceIds extends TeaModel {
        @NameInMap("DeviceId")
        private java.util.List < String > deviceId;

        private DeviceIds(Builder builder) {
            this.deviceId = builder.deviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceIds create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public java.util.List < String > getDeviceId() {
            return this.deviceId;
        }

        public static final class Builder {
            private java.util.List < String > deviceId; 

            /**
             * DeviceId.
             */
            public Builder deviceId(java.util.List < String > deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            public DeviceIds build() {
                return new DeviceIds(this);
            } 

        } 

    }
}
