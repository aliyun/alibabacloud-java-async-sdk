// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The product code. Valid values:</p>
         * <ul>
         * <li>rds: The instance is a subscription instance.</li>
         * <li>bards: The instance is a pay-as-you-go instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder commodity(String commodity) {
            this.putQueryParameter("Commodity", commodity);
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>MariaDB</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
