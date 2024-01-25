// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutGroupResourceTagRequest} extends {@link RequestModel}
 *
 * <p>PutGroupResourceTagRequest</p>
 */
public class PutGroupResourceTagRequest extends Request {
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

    @Query
    @NameInMap("TagId")
    @Validation(required = true)
    private String tagId;

    private PutGroupResourceTagRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.operaUid = builder.operaUid;
        this.productId = builder.productId;
        this.resources = builder.resources;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutGroupResourceTagRequest create() {
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

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<PutGroupResourceTagRequest, Builder> {
        private String businessGroupId; 
        private String operaUid; 
        private String productId; 
        private String resources; 
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(PutGroupResourceTagRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.operaUid = request.operaUid;
            this.productId = request.productId;
            this.resources = request.resources;
            this.tagId = request.tagId;
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

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public PutGroupResourceTagRequest build() {
            return new PutGroupResourceTagRequest(this);
        } 

    } 

}
