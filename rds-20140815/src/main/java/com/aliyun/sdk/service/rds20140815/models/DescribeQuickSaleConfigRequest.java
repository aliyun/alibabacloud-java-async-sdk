// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQuickSaleConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeQuickSaleConfigRequest</p>
 */
public class DescribeQuickSaleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commodity")
    private String commodity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeQuickSaleConfigRequest(Builder builder) {
        super(builder);
        this.commodity = builder.commodity;
        this.engine = builder.engine;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQuickSaleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodity
     */
    public String getCommodity() {
        return this.commodity;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeQuickSaleConfigRequest, Builder> {
        private String commodity; 
        private String engine; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQuickSaleConfigRequest request) {
            super(request);
            this.commodity = request.commodity;
            this.engine = request.engine;
            this.regionId = request.regionId;
        } 

        /**
         * The product code. Valid values:
         * <p>
         * 
         * *   rds: The instance is a subscription instance.
         * *   bards: The instance is a pay-as-you-go instance.
         */
        public Builder commodity(String commodity) {
            this.putQueryParameter("Commodity", commodity);
            this.commodity = commodity;
            return this;
        }

        /**
         * The database engine of the instance. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **SQLServer**
         * *   **PostgreSQL**
         * *   **MariaDB**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeQuickSaleConfigRequest build() {
            return new DescribeQuickSaleConfigRequest(this);
        } 

    } 

}
