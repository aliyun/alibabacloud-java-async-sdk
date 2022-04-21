// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIoTCloudConnectorGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIoTCloudConnectorGroupResponseBody</p>
 */
public class CreateIoTCloudConnectorGroupResponseBody extends TeaModel {
    @NameInMap("IoTCloudConnectorGroupId")
    private String ioTCloudConnectorGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateIoTCloudConnectorGroupResponseBody(Builder builder) {
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIoTCloudConnectorGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return ioTCloudConnectorGroupId
     */
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ioTCloudConnectorGroupId; 
        private String requestId; 

        /**
         * IoTCloudConnectorGroupId.
         */
        public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIoTCloudConnectorGroupResponseBody build() {
            return new CreateIoTCloudConnectorGroupResponseBody(this);
        } 

    } 

}
