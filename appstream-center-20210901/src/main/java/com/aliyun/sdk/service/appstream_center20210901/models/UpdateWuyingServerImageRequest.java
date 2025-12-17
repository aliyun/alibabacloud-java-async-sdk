// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWuyingServerImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateWuyingServerImageRequest</p>
 */
public class UpdateWuyingServerImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerId")
    private String wuyingServerId;

    private UpdateWuyingServerImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.productType = builder.productType;
        this.wuyingServerId = builder.wuyingServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWuyingServerImageRequest create() {
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
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return wuyingServerId
     */
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    public static final class Builder extends Request.Builder<UpdateWuyingServerImageRequest, Builder> {
        private String imageId; 
        private String productType; 
        private String wuyingServerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWuyingServerImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.productType = request.productType;
            this.wuyingServerId = request.wuyingServerId;
        } 

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-0aae4rgk9****6e8p</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The product type. Set this parameter to WuyingServer.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The ID of the workstation.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0bw2f11****dial</p>
         */
        public Builder wuyingServerId(String wuyingServerId) {
            this.putBodyParameter("WuyingServerId", wuyingServerId);
            this.wuyingServerId = wuyingServerId;
            return this;
        }

        @Override
        public UpdateWuyingServerImageRequest build() {
            return new UpdateWuyingServerImageRequest(this);
        } 

    } 

}
