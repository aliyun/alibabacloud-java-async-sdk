// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOperateResultRequest} extends {@link RequestModel}
 *
 * <p>GetOperateResultRequest</p>
 */
public class GetOperateResultRequest extends Request {
    @Query
    @NameInMap("ApiProduct")
    private String apiProduct;

    @Query
    @NameInMap("ResId")
    @Validation(required = true)
    private String resId;

    @Query
    @NameInMap("SerialNo")
    @Validation(required = true)
    private String serialNo;

    private GetOperateResultRequest(Builder builder) {
        super(builder);
        this.apiProduct = builder.apiProduct;
        this.resId = builder.resId;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperateResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiProduct
     */
    public String getApiProduct() {
        return this.apiProduct;
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<GetOperateResultRequest, Builder> {
        private String apiProduct; 
        private String resId; 
        private String serialNo; 

        private Builder() {
            super();
        } 

        private Builder(GetOperateResultRequest request) {
            super(request);
            this.apiProduct = request.apiProduct;
            this.resId = request.resId;
            this.serialNo = request.serialNo;
        } 

        /**
         * ApiProduct.
         */
        public Builder apiProduct(String apiProduct) {
            this.putQueryParameter("ApiProduct", apiProduct);
            this.apiProduct = apiProduct;
            return this;
        }

        /**
         * ResId.
         */
        public Builder resId(String resId) {
            this.putQueryParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putQueryParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public GetOperateResultRequest build() {
            return new GetOperateResultRequest(this);
        } 

    } 

}
