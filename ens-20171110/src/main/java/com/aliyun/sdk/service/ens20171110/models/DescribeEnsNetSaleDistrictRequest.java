// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsNetSaleDistrictRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsNetSaleDistrictRequest</p>
 */
public class DescribeEnsNetSaleDistrictRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetDistrictCode")
    private String netDistrictCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetLevelCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String netLevelCode;

    private DescribeEnsNetSaleDistrictRequest(Builder builder) {
        super(builder);
        this.netDistrictCode = builder.netDistrictCode;
        this.netLevelCode = builder.netLevelCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsNetSaleDistrictRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeEnsNetSaleDistrictRequest, Builder> {
        private String netDistrictCode; 
        private String netLevelCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsNetSaleDistrictRequest request) {
            super(request);
            this.netDistrictCode = request.netDistrictCode;
            this.netLevelCode = request.netLevelCode;
        } 

        /**
         * <p>The region code.</p>
         * <ul>
         * <li>If you do not specify this parameter, only nodes under the area level that is specified by NetLevelCode are queried.</li>
         * <li>If you specify this parameter, only child nodes in the area that is specified by NetDistrictCode are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100105</p>
         */
        public Builder netDistrictCode(String netDistrictCode) {
            this.putQueryParameter("NetDistrictCode", netDistrictCode);
            this.netDistrictCode = netDistrictCode;
            return this;
        }

        /**
         * <p>The network level. Valid values:</p>
         * <ul>
         * <li><strong>Big</strong>: area</li>
         * <li><strong>Middle</strong>: province</li>
         * <li><strong>Small</strong>: city</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Big</p>
         */
        public Builder netLevelCode(String netLevelCode) {
            this.putQueryParameter("NetLevelCode", netLevelCode);
            this.netLevelCode = netLevelCode;
            return this;
        }

        @Override
        public DescribeEnsNetSaleDistrictRequest build() {
            return new DescribeEnsNetSaleDistrictRequest(this);
        } 

    } 

}
