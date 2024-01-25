// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagInfoRequest} extends {@link RequestModel}
 *
 * <p>AddTagInfoRequest</p>
 */
public class AddTagInfoRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductId")
    private Long productId;

    @Query
    @NameInMap("TagName")
    private String tagName;

    private AddTagInfoRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.productId = builder.productId;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTagInfoRequest create() {
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

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<AddTagInfoRequest, Builder> {
        private String operaUid; 
        private Long productId; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(AddTagInfoRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.productId = request.productId;
            this.tagName = request.tagName;
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

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public AddTagInfoRequest build() {
            return new AddTagInfoRequest(this);
        } 

    } 

}
