// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeHiStoreInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpgradeHiStoreInstanceRequest</p>
 */
public class UpgradeHiStoreInstanceRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("HistoreInstanceId")
    @Validation(required = true)
    private String historeInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private UpgradeHiStoreInstanceRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.historeInstanceId = builder.historeInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeHiStoreInstanceRequest create() {
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
     * @return historeInstanceId
     */
    public String getHistoreInstanceId() {
        return this.historeInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpgradeHiStoreInstanceRequest, Builder> {
        private String drdsInstanceId; 
        private String historeInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeHiStoreInstanceRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.historeInstanceId = request.historeInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The ID of the column-oriented storage instance.
         */
        public Builder historeInstanceId(String historeInstanceId) {
            this.putQueryParameter("HistoreInstanceId", historeInstanceId);
            this.historeInstanceId = historeInstanceId;
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

        @Override
        public UpgradeHiStoreInstanceRequest build() {
            return new UpgradeHiStoreInstanceRequest(this);
        } 

    } 

}
