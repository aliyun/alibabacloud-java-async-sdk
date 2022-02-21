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
    @NameInMap("MasterZones")
    private java.util.List < String > masterZones;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlaveZones")
    private java.util.List < String > slaveZones;

    private ListTransitRouterAvailableResourceResponseBody(Builder builder) {
        this.masterZones = builder.masterZones;
        this.requestId = builder.requestId;
        this.slaveZones = builder.slaveZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterAvailableResourceResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private java.util.List < String > masterZones; 
        private String requestId; 
        private java.util.List < String > slaveZones; 

        /**
         * MasterZones.
         */
        public Builder masterZones(java.util.List < String > masterZones) {
            this.masterZones = masterZones;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlaveZones.
         */
        public Builder slaveZones(java.util.List < String > slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }

        public ListTransitRouterAvailableResourceResponseBody build() {
            return new ListTransitRouterAvailableResourceResponseBody(this);
        } 

    } 

}
