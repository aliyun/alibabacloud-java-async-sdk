// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIoTCloudConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIoTCloudConnectorResponseBody</p>
 */
public class CreateIoTCloudConnectorResponseBody extends TeaModel {
    @NameInMap("IoTCloudConnectorId")
    private String ioTCloudConnectorId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateIoTCloudConnectorResponseBody(Builder builder) {
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIoTCloudConnectorResponseBody create() {
        return builder().build();
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ioTCloudConnectorId; 
        private String requestId; 

        /**
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIoTCloudConnectorResponseBody build() {
            return new CreateIoTCloudConnectorResponseBody(this);
        } 

    } 

}
