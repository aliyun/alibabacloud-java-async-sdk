// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceValuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceValuesResponseBody</p>
 */
public class ListDeviceValuesResponseBody extends TeaModel {
    @NameInMap("DeviceValues")
    private java.util.List < String > deviceValues;

    @NameInMap("RequestId")
    private String requestId;

    private ListDeviceValuesResponseBody(Builder builder) {
        this.deviceValues = builder.deviceValues;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceValuesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceValues
     */
    public java.util.List < String > getDeviceValues() {
        return this.deviceValues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > deviceValues; 
        private String requestId; 

        /**
         * DeviceValues.
         */
        public Builder deviceValues(java.util.List < String > deviceValues) {
            this.deviceValues = deviceValues;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeviceValuesResponseBody build() {
            return new ListDeviceValuesResponseBody(this);
        } 

    } 

}
