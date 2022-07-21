// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProductTagsRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductTagsRequest</p>
 */
public class DeleteProductTagsRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("ProductTagKey")
    @Validation(required = true)
    private java.util.List < String > productTagKey;

    private DeleteProductTagsRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.productTagKey = builder.productTagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return productTagKey
     */
    public java.util.List < String > getProductTagKey() {
        return this.productTagKey;
    }

    public static final class Builder extends Request.Builder<DeleteProductTagsRequest, Builder> {
        private String iotInstanceId; 
        private String productKey; 
        private java.util.List < String > productTagKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductTagsRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.productTagKey = request.productTagKey;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * ProductTagKey.
         */
        public Builder productTagKey(java.util.List < String > productTagKey) {
            this.putQueryParameter("ProductTagKey", productTagKey);
            this.productTagKey = productTagKey;
            return this;
        }

        @Override
        public DeleteProductTagsRequest build() {
            return new DeleteProductTagsRequest(this);
        } 

    } 

}
