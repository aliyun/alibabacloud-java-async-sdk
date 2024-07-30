// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceInstanceAttributeRequest</p>
 */
public class UpdateServiceInstanceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseData")
    private LicenseData licenseData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    private UpdateServiceInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.licenseData = builder.licenseData;
        this.regionId = builder.regionId;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceInstanceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return licenseData
     */
    public LicenseData getLicenseData() {
        return this.licenseData;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<UpdateServiceInstanceAttributeRequest, Builder> {
        private String endTime; 
        private LicenseData licenseData; 
        private String regionId; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceInstanceAttributeRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.licenseData = request.licenseData;
            this.regionId = request.regionId;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * The time when the service instance expires.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The License Data
         */
        public Builder licenseData(LicenseData licenseData) {
            String licenseDataShrink = shrink(licenseData, "LicenseData", "json");
            this.putQueryParameter("LicenseData", licenseDataShrink);
            this.licenseData = licenseData;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The service instance ID.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public UpdateServiceInstanceAttributeRequest build() {
            return new UpdateServiceInstanceAttributeRequest(this);
        } 

    } 

    public static class LicenseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomData")
        private String customData;

        private LicenseData(Builder builder) {
            this.customData = builder.customData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LicenseData create() {
            return builder().build();
        }

        /**
         * @return customData
         */
        public String getCustomData() {
            return this.customData;
        }

        public static final class Builder {
            private String customData; 

            /**
             * The Custom Data
             */
            public Builder customData(String customData) {
                this.customData = customData;
                return this;
            }

            public LicenseData build() {
                return new LicenseData(this);
            } 

        } 

    }
}
