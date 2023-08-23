// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelServiceCategoryRequest} extends {@link RequestModel}
 *
 * <p>ListHotelServiceCategoryRequest</p>
 */
public class ListHotelServiceCategoryRequest extends Request {
    @Query
    @NameInMap("Payload")
    @Validation(required = true)
    private Payload payload;

    private ListHotelServiceCategoryRequest(Builder builder) {
        super(builder);
        this.payload = builder.payload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelServiceCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    public static final class Builder extends Request.Builder<ListHotelServiceCategoryRequest, Builder> {
        private Payload payload; 

        private Builder() {
            super();
        } 

        private Builder(ListHotelServiceCategoryRequest request) {
            super(request);
            this.payload = request.payload;
        } 

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        @Override
        public ListHotelServiceCategoryRequest build() {
            return new ListHotelServiceCategoryRequest(this);
        } 

    } 

    public static class Payload extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Payload(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
}
