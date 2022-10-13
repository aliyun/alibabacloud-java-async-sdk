// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWirelessCloudConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWirelessCloudConnectorResponseBody</p>
 */
public class CreateWirelessCloudConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WirelessCloudConnectorId")
    private String wirelessCloudConnectorId;

    private CreateWirelessCloudConnectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWirelessCloudConnectorResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder {
        private String requestId; 
        private String wirelessCloudConnectorId; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        public CreateWirelessCloudConnectorResponseBody build() {
            return new CreateWirelessCloudConnectorResponseBody(this);
        } 

    } 

}
