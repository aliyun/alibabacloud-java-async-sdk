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
 * {@link GetServiceRequest} extends {@link RequestModel}
 *
 * <p>GetServiceRequest</p>
 */
public class GetServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowDetails")
    private java.util.List<String> showDetails;

    private GetServiceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.serviceName = builder.serviceName;
        this.serviceVersion = builder.serviceVersion;
        this.showDetails = builder.showDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return showDetails
     */
    public java.util.List<String> getShowDetails() {
        return this.showDetails;
    }

    public static final class Builder extends Request.Builder<GetServiceRequest, Builder> {
        private String regionId; 
        private String serviceId; 
        private String serviceInstanceId; 
        private String serviceName; 
        private String serviceVersion; 
        private java.util.List<String> showDetails; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.serviceInstanceId = request.serviceInstanceId;
            this.serviceName = request.serviceName;
            this.serviceVersion = request.serviceVersion;
            this.showDetails = request.showDetails;
        } 

        /**
         * <p>Region Id.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0e6fca6a51a544xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service instance id.</p>
         * 
         * <strong>example:</strong>
         * <p>si-b58c874912fc4294****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>Wordpress</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>Whether to disclose service details.</p>
         */
        public Builder showDetails(java.util.List<String> showDetails) {
            this.putQueryParameter("ShowDetails", showDetails);
            this.showDetails = showDetails;
            return this;
        }

        @Override
        public GetServiceRequest build() {
            return new GetServiceRequest(this);
        } 

    } 

}
