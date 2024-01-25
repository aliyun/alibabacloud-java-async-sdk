// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20190325.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageRequest</p>
 */
public class DeleteImageRequest extends Request {
    @Body
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("PicName")
    private String picName;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    private DeleteImageRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.picName = builder.picName;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return picName
     */
    public String getPicName() {
        return this.picName;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<DeleteImageRequest, Builder> {
        private String instanceName; 
        private String picName; 
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.picName = request.picName;
            this.productId = request.productId;
        } 

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * PicName.
         */
        public Builder picName(String picName) {
            this.putBodyParameter("PicName", picName);
            this.picName = picName;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public DeleteImageRequest build() {
            return new DeleteImageRequest(this);
        } 

    } 

}
