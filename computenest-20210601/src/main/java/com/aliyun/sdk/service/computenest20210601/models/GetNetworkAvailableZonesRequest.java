// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetNetworkAvailableZonesRequest} extends {@link RequestModel}
 *
 * <p>GetNetworkAvailableZonesRequest</p>
 */
public class GetNetworkAvailableZonesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsPoc")
    private Boolean isPoc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkRegionId")
    private String networkRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrivateVpcConnectionMode")
    private String privateVpcConnectionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceEndpointServiceType")
    private String serviceInstanceEndpointServiceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    private String serviceRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private GetNetworkAvailableZonesRequest(Builder builder) {
        super(builder);
        this.isPoc = builder.isPoc;
        this.networkRegionId = builder.networkRegionId;
        this.privateVpcConnectionMode = builder.privateVpcConnectionMode;
        this.serviceId = builder.serviceId;
        this.serviceInstanceEndpointServiceType = builder.serviceInstanceEndpointServiceType;
        this.serviceRegionId = builder.serviceRegionId;
        this.serviceVersion = builder.serviceVersion;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkAvailableZonesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isPoc
     */
    public Boolean getIsPoc() {
        return this.isPoc;
    }

    /**
     * @return networkRegionId
     */
    public String getNetworkRegionId() {
        return this.networkRegionId;
    }

    /**
     * @return privateVpcConnectionMode
     */
    public String getPrivateVpcConnectionMode() {
        return this.privateVpcConnectionMode;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceInstanceEndpointServiceType
     */
    public String getServiceInstanceEndpointServiceType() {
        return this.serviceInstanceEndpointServiceType;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<GetNetworkAvailableZonesRequest, Builder> {
        private Boolean isPoc; 
        private String networkRegionId; 
        private String privateVpcConnectionMode; 
        private String serviceId; 
        private String serviceInstanceEndpointServiceType; 
        private String serviceRegionId; 
        private String serviceVersion; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(GetNetworkAvailableZonesRequest request) {
            super(request);
            this.isPoc = request.isPoc;
            this.networkRegionId = request.networkRegionId;
            this.privateVpcConnectionMode = request.privateVpcConnectionMode;
            this.serviceId = request.serviceId;
            this.serviceInstanceEndpointServiceType = request.serviceInstanceEndpointServiceType;
            this.serviceRegionId = request.serviceRegionId;
            this.serviceVersion = request.serviceVersion;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether the service is a trial.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isPoc(Boolean isPoc) {
            this.putBodyParameter("IsPoc", isPoc);
            this.isPoc = isPoc;
            return this;
        }

        /**
         * <p>The region of the virtual network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder networkRegionId(String networkRegionId) {
            this.putBodyParameter("NetworkRegionId", networkRegionId);
            this.networkRegionId = networkRegionId;
            return this;
        }

        /**
         * <p>The connection mode. Valid values: \<code>PrivateLink\\</code> and \<code>OverlayLink\\</code>. \<code>OverlayLink\\</code> is an overlay link based on Application-aware Network Service Mesh (ANSM).</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateLink</p>
         */
        public Builder privateVpcConnectionMode(String privateVpcConnectionMode) {
            this.putBodyParameter("PrivateVpcConnectionMode", privateVpcConnectionMode);
            this.privateVpcConnectionMode = privateVpcConnectionMode;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-55fc2eabbce647fa976b</p>
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The direction of the internal-facing access. Valid values: \<code>Forward\\</code> and \<code>Reverse\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder serviceInstanceEndpointServiceType(String serviceInstanceEndpointServiceType) {
            this.putBodyParameter("ServiceInstanceEndpointServiceType", serviceInstanceEndpointServiceType);
            this.serviceInstanceEndpointServiceType = serviceInstanceEndpointServiceType;
            return this;
        }

        /**
         * <p>The ID of the region where the service is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putBodyParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putBodyParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The zone for the service deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public GetNetworkAvailableZonesRequest build() {
            return new GetNetworkAvailableZonesRequest(this);
        } 

    } 

}
