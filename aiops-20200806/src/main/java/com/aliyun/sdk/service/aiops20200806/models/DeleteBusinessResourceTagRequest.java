// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBusinessResourceTagRequest} extends {@link RequestModel}
 *
 * <p>DeleteBusinessResourceTagRequest</p>
 */
public class DeleteBusinessResourceTagRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    @Validation(required = true)
    private String businessGroupId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductId")
    private String productId;

    @Query
    @NameInMap("Resources")
    @Validation(required = true)
    private String resources;

    private DeleteBusinessResourceTagRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.operaUid = builder.operaUid;
        this.productId = builder.productId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBusinessResourceTagRequest create() {
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
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<DeleteBusinessResourceTagRequest, Builder> {
        private String businessGroupId; 
        private String operaUid; 
        private String productId; 
        private String resources; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBusinessResourceTagRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.operaUid = request.operaUid;
            this.productId = request.productId;
            this.resources = request.resources;
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
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public DeleteBusinessResourceTagRequest build() {
            return new DeleteBusinessResourceTagRequest(this);
        } 

    } 

}
