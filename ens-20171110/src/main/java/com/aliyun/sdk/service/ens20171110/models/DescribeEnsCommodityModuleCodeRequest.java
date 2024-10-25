// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEnsCommodityModuleCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsCommodityModuleCodeRequest</p>
 */
public class DescribeEnsCommodityModuleCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleCode")
    private String moduleCode;

    private DescribeEnsCommodityModuleCodeRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.moduleCode = builder.moduleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsCommodityModuleCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return moduleCode
     */
    public String getModuleCode() {
        return this.moduleCode;
    }

    public static final class Builder extends Request.Builder<DescribeEnsCommodityModuleCodeRequest, Builder> {
        private String commodityCode; 
        private String moduleCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsCommodityModuleCodeRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.moduleCode = request.moduleCode;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * ModuleCode.
         */
        public Builder moduleCode(String moduleCode) {
            this.putQueryParameter("ModuleCode", moduleCode);
            this.moduleCode = moduleCode;
            return this;
        }

        @Override
        public DescribeEnsCommodityModuleCodeRequest build() {
            return new DescribeEnsCommodityModuleCodeRequest(this);
        } 

    } 

}
