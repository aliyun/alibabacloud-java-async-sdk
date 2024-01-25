// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskResultStatisticalRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskResultStatisticalRequest</p>
 */
public class DescribeRiskResultStatisticalRequest extends Request {
    @Body
    @NameInMap("ContinuousDays")
    private Integer continuousDays;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("ProductCode")
    private String productCode;

    private DescribeRiskResultStatisticalRequest(Builder builder) {
        super(builder);
        this.continuousDays = builder.continuousDays;
        this.operaUid = builder.operaUid;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskResultStatisticalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return continuousDays
     */
    public Integer getContinuousDays() {
        return this.continuousDays;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<DescribeRiskResultStatisticalRequest, Builder> {
        private Integer continuousDays; 
        private String operaUid; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskResultStatisticalRequest request) {
            super(request);
            this.continuousDays = request.continuousDays;
            this.operaUid = request.operaUid;
            this.productCode = request.productCode;
        } 

        /**
         * ContinuousDays.
         */
        public Builder continuousDays(Integer continuousDays) {
            this.putBodyParameter("ContinuousDays", continuousDays);
            this.continuousDays = continuousDays;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DescribeRiskResultStatisticalRequest build() {
            return new DescribeRiskResultStatisticalRequest(this);
        } 

    } 

}
