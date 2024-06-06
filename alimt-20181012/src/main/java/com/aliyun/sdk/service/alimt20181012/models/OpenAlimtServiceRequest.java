// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAlimtServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenAlimtServiceRequest</p>
 */
public class OpenAlimtServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private OpenAlimtServiceRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenAlimtServiceRequest create() {
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

    public static final class Builder extends Request.Builder<OpenAlimtServiceRequest, Builder> {
        private Long ownerId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OpenAlimtServiceRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.type = request.type;
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
        public OpenAlimtServiceRequest build() {
            return new OpenAlimtServiceRequest(this);
        } 

    } 

}
