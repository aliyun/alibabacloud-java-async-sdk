// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeInstanceVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeInstanceVersionRequest</p>
 */
public class UpgradeInstanceVersionRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Rpm")
    private String rpm;

    private UpgradeInstanceVersionRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.regionId = builder.regionId;
        this.rpm = builder.rpm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeInstanceVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rpm
     */
    public String getRpm() {
        return this.rpm;
    }

    public static final class Builder extends Request.Builder<UpgradeInstanceVersionRequest, Builder> {
        private String drdsInstanceId; 
        private String regionId; 
        private String rpm; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeInstanceVersionRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.regionId = request.regionId;
            this.rpm = request.rpm;
        } 

        /**
         * The ID of the PolarDB-X 1.0 instance that you want to upgrade.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The version number of the PolarDB-X 1.0 instance. You can leave this parameter unspecified.
         */
        public Builder rpm(String rpm) {
            this.putQueryParameter("Rpm", rpm);
            this.rpm = rpm;
            return this;
        }

        @Override
        public UpgradeInstanceVersionRequest build() {
            return new UpgradeInstanceVersionRequest(this);
        } 

    } 

}
