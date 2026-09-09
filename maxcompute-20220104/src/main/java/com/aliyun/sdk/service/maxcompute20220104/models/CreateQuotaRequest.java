// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreateQuotaRequest} extends {@link RequestModel}
 *
 * <p>CreateQuotaRequest</p>
 */
public class CreateQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("chargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("commodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("commodityData")
    private String commodityData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("partNickName")
    private String partNickName;

    private CreateQuotaRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.commodityCode = builder.commodityCode;
        this.commodityData = builder.commodityData;
        this.partNickName = builder.partNickName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return commodityData
     */
    public String getCommodityData() {
        return this.commodityData;
    }

    /**
     * @return partNickName
     */
    public String getPartNickName() {
        return this.partNickName;
    }

    public static final class Builder extends Request.Builder<CreateQuotaRequest, Builder> {
        private String chargeType; 
        private String commodityCode; 
        private String commodityData; 
        private String partNickName; 

        private Builder() {
            super();
        } 

        private Builder(CreateQuotaRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.commodityCode = request.commodityCode;
            this.commodityData = request.commodityData;
            this.partNickName = request.partNickName;
        } 

        /**
         * <p>The billing method. Valid values: payasyougo (pay-as-you-go) and subscription.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>payasyougo</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("chargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The commodity code. Example: On Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>), the commodity code for pay-as-you-go is odps and the commodity code for subscription is odpsplus. On Alibaba Cloud International Website (<a href="http://www.alibabacloud.com">www.alibabacloud.com</a>), the commodity code for pay-as-you-go is odps_intl and the commodity code for subscription is odpsplus_intl.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("commodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The commodity specifications of the quota.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required only for subscription quotas.
         * The minimum unit for cu is 50.
         * ord_time supports monthly (month) and yearly (year) billing.</p>
         * </li>
         * <li><p>After creation, commodityData cannot be modified. To modify it, go to the MaxCompute console.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CU&quot;:50,&quot;ord_time&quot;:&quot;1:Month&quot;,&quot;autoRenew&quot;:false}</p>
         */
        public Builder commodityData(String commodityData) {
            this.putQueryParameter("commodityData", commodityData);
            this.commodityData = commodityData;
            return this;
        }

        /**
         * <blockquote>
         * <p>Notice: This parameter is required only for subscription quotas.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MyQuota</p>
         */
        public Builder partNickName(String partNickName) {
            this.putQueryParameter("partNickName", partNickName);
            this.partNickName = partNickName;
            return this;
        }

        @Override
        public CreateQuotaRequest build() {
            return new CreateQuotaRequest(this);
        } 

    } 

}
