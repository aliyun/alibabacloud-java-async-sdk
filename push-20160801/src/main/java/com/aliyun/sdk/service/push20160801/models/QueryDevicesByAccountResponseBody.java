// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link QueryDevicesByAccountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDevicesByAccountResponseBody</p>
 */
public class QueryDevicesByAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceIds")
    private DeviceIds deviceIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDevicesByAccountResponseBody(Builder builder) {
        this.deviceIds = builder.deviceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicesByAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryDevicesByAccountResponseBody model) {
            this.deviceIds = model.deviceIds;
            this.requestId = model.requestId;
        } 

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

        public QueryDevicesByAccountResponseBody build() {
            return new QueryDevicesByAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDevicesByAccountResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicesByAccountResponseBody</p>
     */
    public static class DeviceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private java.util.List<String> deviceId;

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
        public java.util.List<String> getDeviceId() {
            return this.deviceId;
        }

        public static final class Builder {
            private java.util.List<String> deviceId; 

            private Builder() {
            } 

            private Builder(DeviceIds model) {
                this.deviceId = model.deviceId;
            } 

            /**
             * DeviceId.
             */
            public Builder deviceId(java.util.List<String> deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            public DeviceIds build() {
                return new DeviceIds(this);
            } 

        } 

    }
}
