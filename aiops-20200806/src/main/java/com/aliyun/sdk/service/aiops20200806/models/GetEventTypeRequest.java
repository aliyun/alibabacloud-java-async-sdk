// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEventTypeRequest} extends {@link RequestModel}
 *
 * <p>GetEventTypeRequest</p>
 */
public class GetEventTypeRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductId")
    private Integer productId;

    private GetEventTypeRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.id = builder.id;
        this.operaUid = builder.operaUid;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventTypeRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<GetEventTypeRequest, Builder> {
        private String businessGroupId; 
        private Long id; 
        private String operaUid; 
        private Integer productId; 

        private Builder() {
            super();
        } 

        private Builder(GetEventTypeRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.id = request.id;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public GetEventTypeRequest build() {
            return new GetEventTypeRequest(this);
        } 

    } 

}
