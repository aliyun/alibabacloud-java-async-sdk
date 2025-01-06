// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ListTransitRouterAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterAvailableResourceResponseBody</p>
 */
public class ListTransitRouterAvailableResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private java.util.List<String> availableZones;

    @com.aliyun.core.annotation.NameInMap("MasterZones")
    private java.util.List<String> masterZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlaveZones")
    private java.util.List<String> slaveZones;

    @com.aliyun.core.annotation.NameInMap("SupportMulticast")
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
    public java.util.List<String> getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return masterZones
     */
    public java.util.List<String> getMasterZones() {
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
    public java.util.List<String> getSlaveZones() {
        return this.slaveZones;
    }

    /**
     * @return supportMulticast
     */
    public Boolean getSupportMulticast() {
        return this.supportMulticast;
    }

    public static final class Builder {
        private java.util.List<String> availableZones; 
        private java.util.List<String> masterZones; 
        private String requestId; 
        private java.util.List<String> slaveZones; 
        private Boolean supportMulticast; 

        /**
         * <p>A list of zone IDs.</p>
         */
        public Builder availableZones(java.util.List<String> availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * <p>A list of primary zones.</p>
         */
        public Builder masterZones(java.util.List<String> masterZones) {
            this.masterZones = masterZones;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4F480E0-4E76-5E43-9966-8322C28A158A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of secondary zone IDs.</p>
         */
        public Builder slaveZones(java.util.List<String> slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }

        /**
         * <p>Indicates whether the zone supports the multicast feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
