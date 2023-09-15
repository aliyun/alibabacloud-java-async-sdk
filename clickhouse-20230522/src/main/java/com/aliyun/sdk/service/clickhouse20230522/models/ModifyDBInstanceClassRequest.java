// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceClassRequest</p>
 */
public class ModifyDBInstanceClassRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ScaleMax")
    private Long scaleMax;

    @Query
    @NameInMap("ScaleMin")
    private Long scaleMin;

    private ModifyDBInstanceClassRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceClassRequest create() {
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
     * @return scaleMax
     */
    public Long getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public Long getScaleMin() {
        return this.scaleMin;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceClassRequest, Builder> {
        private String DBInstanceId; 
        private String regionId; 
        private Long scaleMax; 
        private Long scaleMin; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceClassRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.regionId = request.regionId;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
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
         * ScaleMax.
         */
        public Builder scaleMax(Long scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * ScaleMin.
         */
        public Builder scaleMin(Long scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        @Override
        public ModifyDBInstanceClassRequest build() {
            return new ModifyDBInstanceClassRequest(this);
        } 

    } 

}
