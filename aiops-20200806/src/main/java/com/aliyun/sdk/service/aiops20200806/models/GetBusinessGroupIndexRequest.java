// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessGroupIndexRequest} extends {@link RequestModel}
 *
 * <p>GetBusinessGroupIndexRequest</p>
 */
public class GetBusinessGroupIndexRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductId")
    private Integer productId;

    private GetBusinessGroupIndexRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.operaUid = builder.operaUid;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusinessGroupIndexRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
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
    public Integer getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<GetBusinessGroupIndexRequest, Builder> {
        private String businessGroupId; 
        private String operaUid; 
        private Integer productId; 

        private Builder() {
            super();
        } 

        private Builder(GetBusinessGroupIndexRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.operaUid = request.operaUid;
            this.productId = request.productId;
        } 

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
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
        public Builder productId(Integer productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public GetBusinessGroupIndexRequest build() {
            return new GetBusinessGroupIndexRequest(this);
        } 

    } 

}
