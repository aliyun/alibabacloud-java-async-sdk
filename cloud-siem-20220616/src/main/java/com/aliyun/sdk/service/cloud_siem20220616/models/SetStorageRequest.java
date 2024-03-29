// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetStorageRequest} extends {@link RequestModel}
 *
 * <p>SetStorageRequest</p>
 */
public class SetStorageRequest extends Request {
    @Body
    @NameInMap("Region")
    private String region;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Ttl")
    @Validation(required = true)
    private Integer ttl;

    private SetStorageRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetStorageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<SetStorageRequest, Builder> {
        private String region; 
        private String regionId; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(SetStorageRequest request) {
            super(request);
            this.region = request.region;
            this.regionId = request.regionId;
            this.ttl = request.ttl;
        } 

        /**
         * The storage region of logs.
         * <p>
         * 
         * If the data management center is **cn-hangzhou**, the default value of **Region** is cn-shanghai, which specifies the China (Shanghai) region. If the data management center is **ap-southeast-1**, the default value of **Region** is ap-southeast-1, which specifies the Singapore region.
         * 
         * The region for log storage cannot be changed. To change the region, contact the technical support of threat analysis.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The storage duration of logs. Default value: 180. Minimum value: 30. Maximum value: 3000. Unit: days.
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public SetStorageRequest build() {
            return new SetStorageRequest(this);
        } 

    } 

}
