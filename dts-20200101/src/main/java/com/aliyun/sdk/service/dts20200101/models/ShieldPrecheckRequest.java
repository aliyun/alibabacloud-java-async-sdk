// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShieldPrecheckRequest} extends {@link RequestModel}
 *
 * <p>ShieldPrecheckRequest</p>
 */
public class ShieldPrecheckRequest extends Request {
    @Query
    @NameInMap("DtsInstanceId")
    @Validation(required = true)
    private String dtsInstanceId;

    @Query
    @NameInMap("PrecheckItems")
    @Validation(required = true)
    private String precheckItems;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ShieldPrecheckRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.precheckItems = builder.precheckItems;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShieldPrecheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return precheckItems
     */
    public String getPrecheckItems() {
        return this.precheckItems;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ShieldPrecheckRequest, Builder> {
        private String dtsInstanceId; 
        private String precheckItems; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ShieldPrecheckRequest response) {
            super(response);
            this.dtsInstanceId = response.dtsInstanceId;
            this.precheckItems = response.precheckItems;
            this.regionId = response.regionId;
        } 

        /**
         * DtsInstanceId.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * PrecheckItems.
         */
        public Builder precheckItems(String precheckItems) {
            this.putQueryParameter("PrecheckItems", precheckItems);
            this.precheckItems = precheckItems;
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

        @Override
        public ShieldPrecheckRequest build() {
            return new ShieldPrecheckRequest(this);
        } 

    } 

}
