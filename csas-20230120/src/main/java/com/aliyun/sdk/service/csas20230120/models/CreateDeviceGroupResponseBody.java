// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateDeviceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeviceGroupResponseBody</p>
 */
public class CreateDeviceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    private String deviceGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDeviceGroupResponseBody(Builder builder) {
        this.deviceGroupId = builder.deviceGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deviceGroupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDeviceGroupResponseBody model) {
            this.deviceGroupId = model.deviceGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDeviceGroupResponseBody build() {
            return new CreateDeviceGroupResponseBody(this);
        } 

    } 

}
