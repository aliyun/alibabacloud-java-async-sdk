// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link EnableServicesRequest} extends {@link RequestModel}
 *
 * <p>EnableServicesRequest</p>
 */
public class EnableServicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceNames")
    private java.util.List<String> serviceNames;

    private EnableServicesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.serviceNames = builder.serviceNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableServicesRequest create() {
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
     * @return serviceNames
     */
    public java.util.List<String> getServiceNames() {
        return this.serviceNames;
    }

    public static final class Builder extends Request.Builder<EnableServicesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> serviceNames; 

        private Builder() {
            super();
        } 

        private Builder(EnableServicesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.serviceNames = request.serviceNames;
        } 

        /**
         * <p>This parameter is required.</p>
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
         * ServiceNames.
         */
        public Builder serviceNames(java.util.List<String> serviceNames) {
            String serviceNamesShrink = shrink(serviceNames, "ServiceNames", "json");
            this.putQueryParameter("ServiceNames", serviceNamesShrink);
            this.serviceNames = serviceNames;
            return this;
        }

        @Override
        public EnableServicesRequest build() {
            return new EnableServicesRequest(this);
        } 

    } 

}
