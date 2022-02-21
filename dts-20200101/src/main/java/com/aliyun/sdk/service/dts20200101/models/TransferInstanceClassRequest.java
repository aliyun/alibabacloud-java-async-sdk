// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferInstanceClassRequest} extends {@link RequestModel}
 *
 * <p>TransferInstanceClassRequest</p>
 */
public class TransferInstanceClassRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("InstanceClass")
    @Validation(required = true)
    private String instanceClass;

    @Query
    @NameInMap("OrderType")
    @Validation(required = true)
    private String orderType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private TransferInstanceClassRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.instanceClass = builder.instanceClass;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferInstanceClassRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<TransferInstanceClassRequest, Builder> {
        private String dtsJobId; 
        private String instanceClass; 
        private String orderType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(TransferInstanceClassRequest response) {
            super(response);
            this.dtsJobId = response.dtsJobId;
            this.instanceClass = response.instanceClass;
            this.orderType = response.orderType;
            this.regionId = response.regionId;
        } 

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * InstanceClass.
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
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
        public TransferInstanceClassRequest build() {
            return new TransferInstanceClassRequest(this);
        } 

    } 

}
