// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceConfigDateResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceConfigDateResponseBody</p>
 */
public class GetDeviceConfigDateResponseBody extends TeaModel {
    @NameInMap("DeviceConfigDate")
    private java.util.List < String > deviceConfigDate;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeviceConfigDateResponseBody(Builder builder) {
        this.deviceConfigDate = builder.deviceConfigDate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceConfigDateResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceConfigDate
     */
    public java.util.List < String > getDeviceConfigDate() {
        return this.deviceConfigDate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > deviceConfigDate; 
        private String requestId; 

        /**
         * 设备配置内容
         */
        public Builder deviceConfigDate(java.util.List < String > deviceConfigDate) {
            this.deviceConfigDate = deviceConfigDate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceConfigDateResponseBody build() {
            return new GetDeviceConfigDateResponseBody(this);
        } 

    } 

}
