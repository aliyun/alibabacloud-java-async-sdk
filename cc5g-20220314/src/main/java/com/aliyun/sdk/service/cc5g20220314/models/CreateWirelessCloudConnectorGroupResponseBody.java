// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWirelessCloudConnectorGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWirelessCloudConnectorGroupResponseBody</p>
 */
public class CreateWirelessCloudConnectorGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WirelessCloudConnectorGroupId")
    private String wirelessCloudConnectorGroupId;

    private CreateWirelessCloudConnectorGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.wirelessCloudConnectorGroupId = builder.wirelessCloudConnectorGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWirelessCloudConnectorGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return wirelessCloudConnectorGroupId
     */
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String wirelessCloudConnectorGroupId; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WirelessCloudConnectorGroupId.
         */
        public Builder wirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
            this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
            return this;
        }

        public CreateWirelessCloudConnectorGroupResponseBody build() {
            return new CreateWirelessCloudConnectorGroupResponseBody(this);
        } 

    } 

}
