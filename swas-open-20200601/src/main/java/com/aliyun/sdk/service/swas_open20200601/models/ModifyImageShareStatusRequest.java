// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageShareStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageShareStatusRequest</p>
 */
public class ModifyImageShareStatusRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("Operation")
    @Validation(required = true)
    private String operation;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyImageShareStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.imageId = builder.imageId;
        this.operation = builder.operation;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageShareStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyImageShareStatusRequest, Builder> {
        private String clientToken; 
        private String imageId; 
        private String operation; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageShareStatusRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.imageId = request.imageId;
            this.operation = request.operation;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.**** For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Valid values:
         * <p>
         * 
         * *   Share
         * *   UnShare
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * The region ID of the custom image. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyImageShareStatusRequest build() {
            return new ModifyImageShareStatusRequest(this);
        } 

    } 

}
