// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenArmsServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenArmsServiceRequest</p>
 */
public class OpenArmsServiceRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private OpenArmsServiceRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenArmsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OpenArmsServiceRequest, Builder> {
        private Long ownerId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OpenArmsServiceRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.type = response.type;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OpenArmsServiceRequest build() {
            return new OpenArmsServiceRequest(this);
        } 

    } 

}
