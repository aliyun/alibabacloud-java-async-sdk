// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageAttributeRequest</p>
 */
public class ModifyImageAttributeRequest extends Request {
    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("ImageName")
    @Validation(required = true)
    private String imageName;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    @Query
    @NameInMap("product")
    private String product;

    private ModifyImageAttributeRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.version = builder.version;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<ModifyImageAttributeRequest, Builder> {
        private String imageId; 
        private String imageName; 
        private String version; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageAttributeRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.version = request.version;
            this.product = request.product;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
         * 2017-11-10
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
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
        public ModifyImageAttributeRequest build() {
            return new ModifyImageAttributeRequest(this);
        } 

    } 

}
