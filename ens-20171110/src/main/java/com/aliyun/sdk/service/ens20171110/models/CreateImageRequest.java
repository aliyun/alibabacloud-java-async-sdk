// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @Query
    @NameInMap("DeleteAfterImageUpload")
    private String deleteAfterImageUpload;

    @Query
    @NameInMap("ImageName")
    @Validation(required = true)
    private String imageName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("product")
    private String product;

    private CreateImageRequest(Builder builder) {
        super(builder);
        this.deleteAfterImageUpload = builder.deleteAfterImageUpload;
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteAfterImageUpload
     */
    public String getDeleteAfterImageUpload() {
        return this.deleteAfterImageUpload;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<CreateImageRequest, Builder> {
        private String deleteAfterImageUpload; 
        private String imageName; 
        private String instanceId; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageRequest request) {
            super(request);
            this.deleteAfterImageUpload = request.deleteAfterImageUpload;
            this.imageName = request.imageName;
            this.instanceId = request.instanceId;
            this.product = request.product;
        } 

        /**
         * DeleteAfterImageUpload.
         */
        public Builder deleteAfterImageUpload(String deleteAfterImageUpload) {
            this.putQueryParameter("DeleteAfterImageUpload", deleteAfterImageUpload);
            this.deleteAfterImageUpload = deleteAfterImageUpload;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * product.
         */
        public Builder product(String product) {
            this.putQueryParameter("product", product);
            this.product = product;
            return this;
        }

        @Override
        public CreateImageRequest build() {
            return new CreateImageRequest(this);
        } 

    } 

}
