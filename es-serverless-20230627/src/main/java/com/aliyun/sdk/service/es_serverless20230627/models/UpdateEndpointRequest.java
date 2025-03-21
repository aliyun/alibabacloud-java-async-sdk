// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link UpdateEndpointRequest} extends {@link RequestModel}
 *
 * <p>UpdateEndpointRequest</p>
 */
public class UpdateEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("endpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endpointZones")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<EndpointZones> endpointZones;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private UpdateEndpointRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.endpointZones = builder.endpointZones;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return endpointZones
     */
    public java.util.List<EndpointZones> getEndpointZones() {
        return this.endpointZones;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateEndpointRequest, Builder> {
        private String endpointId; 
        private java.util.List<EndpointZones> endpointZones; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEndpointRequest request) {
            super(request);
            this.endpointId = request.endpointId;
            this.endpointZones = request.endpointZones;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp1i98bcbb1540d0****</p>
         */
        public Builder endpointId(String endpointId) {
            this.putPathParameter("endpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endpointZones(java.util.List<EndpointZones> endpointZones) {
            this.putBodyParameter("endpointZones", endpointZones);
            this.endpointZones = endpointZones;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateEndpointRequest build() {
            return new UpdateEndpointRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEndpointRequest} extends {@link TeaModel}
     *
     * <p>UpdateEndpointRequest</p>
     */
    public static class EndpointZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private EndpointZones(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointZones create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String zoneId; 

            /**
             * vSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public EndpointZones build() {
                return new EndpointZones(this);
            } 

        } 

    }
}
