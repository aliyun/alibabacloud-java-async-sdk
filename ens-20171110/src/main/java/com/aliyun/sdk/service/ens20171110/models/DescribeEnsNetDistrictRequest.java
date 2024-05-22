// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsNetDistrictRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsNetDistrictRequest</p>
 */
public class DescribeEnsNetDistrictRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetDistrictCode")
    private String netDistrictCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetLevelCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String netLevelCode;

    private DescribeEnsNetDistrictRequest(Builder builder) {
        super(builder);
        this.netDistrictCode = builder.netDistrictCode;
        this.netLevelCode = builder.netLevelCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsNetDistrictRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return netDistrictCode
     */
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

    /**
     * @return netLevelCode
     */
    public String getNetLevelCode() {
        return this.netLevelCode;
    }

    public static final class Builder extends Request.Builder<DescribeEnsNetDistrictRequest, Builder> {
        private String netDistrictCode; 
        private String netLevelCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsNetDistrictRequest request) {
            super(request);
            this.netDistrictCode = request.netDistrictCode;
            this.netLevelCode = request.netLevelCode;
        } 

        /**
         * The code of the region.
         * <p>
         * 
         * If you do not specify this parameter, only nodes in the regions of the level that is specified by the NetLevelCode parameter are queried.
         * 
         * If you specify this parameter, only nodes in the regions of the level that is specified by this parameter are queried.
         */
        public Builder netDistrictCode(String netDistrictCode) {
            this.putQueryParameter("NetDistrictCode", netDistrictCode);
            this.netDistrictCode = netDistrictCode;
            return this;
        }

        /**
         * The level of the region.
         * <p>
         * 
         * *   **Big**: area
         * *   **Middle**: province
         * *   **Small**: city
         */
        public Builder netLevelCode(String netLevelCode) {
            this.putQueryParameter("NetLevelCode", netLevelCode);
            this.netLevelCode = netLevelCode;
            return this;
        }

        @Override
        public DescribeEnsNetDistrictRequest build() {
            return new DescribeEnsNetDistrictRequest(this);
        } 

    } 

}
