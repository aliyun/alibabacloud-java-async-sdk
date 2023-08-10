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

        private Builder(TransferInstanceClassRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.instanceClass = request.instanceClass;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the data migration or data synchronization task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The new instance class of the DTS instance. You can call the [DescribeDtsJobDetail](~~208925~~) operation to query the original instance class of the DTS instance.
         * <p>
         * 
         * *   DTS supports the following instance classes for a data migration instance: **xxlarge**, **xlarge**, **large**, **medium**, and **small**.
         * *   DTS supports the following instance classes for a data synchronization instance: **large**, **medium**, **small**, and **micro**.
         * 
         * >  For more information about the test performance of each instance class, see [Specifications of data migration instances](~~26606~~) and [Specifications of data synchronization instances](~~26605~~).
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * Specifies whether to upgrade or downgrade the DTS instance. Valid values:
         * <p>
         * 
         * *   **UPGRADE**
         * *   **DOWNGRADE**
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The ID of the region where the DTS instance resides. For more information, see [List of supported regions](~~141033~~).
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
