// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStreamingDataServiceRequest} extends {@link RequestModel}
 *
 * <p>ModifyStreamingDataServiceRequest</p>
 */
public class ModifyStreamingDataServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceDescription")
    private String serviceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceSpec;

    private ModifyStreamingDataServiceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
        this.serviceDescription = builder.serviceDescription;
        this.serviceId = builder.serviceId;
        this.serviceSpec = builder.serviceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStreamingDataServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceDescription
     */
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceSpec
     */
    public String getServiceSpec() {
        return this.serviceSpec;
    }

    public static final class Builder extends Request.Builder<ModifyStreamingDataServiceRequest, Builder> {
        private String DBInstanceId; 
        private String regionId; 
        private String serviceDescription; 
        private String serviceId; 
        private String serviceSpec; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStreamingDataServiceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.regionId = request.regionId;
            this.serviceDescription = request.serviceDescription;
            this.serviceId = request.serviceId;
            this.serviceSpec = request.serviceSpec;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceDescription.
         */
        public Builder serviceDescription(String serviceDescription) {
            this.putQueryParameter("ServiceDescription", serviceDescription);
            this.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceSpec.
         */
        public Builder serviceSpec(String serviceSpec) {
            this.putQueryParameter("ServiceSpec", serviceSpec);
            this.serviceSpec = serviceSpec;
            return this;
        }

        @Override
        public ModifyStreamingDataServiceRequest build() {
            return new ModifyStreamingDataServiceRequest(this);
        } 

    } 

}
