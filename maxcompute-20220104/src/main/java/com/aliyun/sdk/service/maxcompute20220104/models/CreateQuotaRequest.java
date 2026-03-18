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
         * commodityData.
         */
        public Builder commodityData(String commodityData) {
            this.putQueryParameter("commodityData", commodityData);
            this.commodityData = commodityData;
            return this;
        }

        /**
         * partNickName.
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
