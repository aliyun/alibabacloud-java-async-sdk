// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterAvailableResourceResponseBody</p>
 */
public class ListTransitRouterAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    private java.util.List < String > availableZones;

    @NameInMap("MasterZones")
    private java.util.List < String > masterZones;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlaveZones")
    private java.util.List < String > slaveZones;

    @NameInMap("SupportMulticast")
    private Boolean supportMulticast;

    private ListTransitRouterAvailableResourceResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.masterZones = builder.masterZones;
        this.requestId = builder.requestId;
        this.slaveZones = builder.slaveZones;
        this.supportMulticast = builder.supportMulticast;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterAvailableResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableZones
     */
    public java.util.List < String > getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return masterZones
     */
    public java.util.List < String > getMasterZones() {
        return this.masterZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slaveZones
     */
    public java.util.List < String > getSlaveZones() {
        return this.slaveZones;
    }

    /**
     * @return supportMulticast
     */
    public Boolean getSupportMulticast() {
        return this.supportMulticast;
    }

    public static final class Builder {
        private java.util.List < String > availableZones; 
        private java.util.List < String > masterZones; 
        private String requestId; 
        private java.util.List < String > slaveZones; 
        private Boolean supportMulticast; 

        /**
         * AvailableZones.
         */
        public Builder availableZones(java.util.List < String > availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * ListTransitRouterAvailableResource
         */
        public Builder masterZones(java.util.List < String > masterZones) {
            this.masterZones = masterZones;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **ListTransitRouterAvailableResource**.
         */
        public Builder slaveZones(java.util.List < String > slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }

        /**
         * 是否为支持组播功能的可用区信息。
         */
        public Builder supportMulticast(Boolean supportMulticast) {
            this.supportMulticast = supportMulticast;
            return this;
        }

        public ListTransitRouterAvailableResourceResponseBody build() {
            return new ListTransitRouterAvailableResourceResponseBody(this);
        } 

    } 

}
