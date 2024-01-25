// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagDropListRequest} extends {@link RequestModel}
 *
 * <p>GetTagDropListRequest</p>
 */
public class GetTagDropListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductId")
    private Long productId;

    private GetTagDropListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagDropListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<GetTagDropListRequest, Builder> {
        private String operaUid; 
        private Long productId; 

        private Builder() {
            super();
        } 

        private Builder(GetTagDropListRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.productId = request.productId;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public GetTagDropListRequest build() {
            return new GetTagDropListRequest(this);
        } 

    } 

}
