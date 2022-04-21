// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorAvailableZonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorAvailableZonesResponseBody</p>
 */
public class ListIoTCloudConnectorAvailableZonesResponseBody extends TeaModel {
    @NameInMap("AvailableZoneList")
    private java.util.List < String > availableZoneList;

    @NameInMap("IoTCloudConnectorId")
    private String ioTCloudConnectorId;

    @NameInMap("RequestId")
    private String requestId;

    private ListIoTCloudConnectorAvailableZonesResponseBody(Builder builder) {
        this.availableZoneList = builder.availableZoneList;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIoTCloudConnectorAvailableZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableZoneList
     */
    public java.util.List < String > getAvailableZoneList() {
        return this.availableZoneList;
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
        private java.util.List < String > availableZoneList; 
        private String ioTCloudConnectorId; 
        private String requestId; 

        /**
         * AvailableZoneList.
         */
        public Builder availableZoneList(java.util.List < String > availableZoneList) {
            this.availableZoneList = availableZoneList;
            return this;
        }

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

        public ListIoTCloudConnectorAvailableZonesResponseBody build() {
            return new ListIoTCloudConnectorAvailableZonesResponseBody(this);
        } 

    } 

}
