// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHotelSceneBookItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateHotelSceneBookItemRequest</p>
 */
public class UpdateHotelSceneBookItemRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Query
    @NameInMap("UpdateHotelSceneBookReq")
    @Validation(required = true)
    private UpdateHotelSceneBookReq updateHotelSceneBookReq;

    private UpdateHotelSceneBookItemRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.updateHotelSceneBookReq = builder.updateHotelSceneBookReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHotelSceneBookItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return updateHotelSceneBookReq
     */
    public UpdateHotelSceneBookReq getUpdateHotelSceneBookReq() {
        return this.updateHotelSceneBookReq;
    }

    public static final class Builder extends Request.Builder<UpdateHotelSceneBookItemRequest, Builder> {
        private String hotelId; 
        private UpdateHotelSceneBookReq updateHotelSceneBookReq; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHotelSceneBookItemRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.updateHotelSceneBookReq = request.updateHotelSceneBookReq;
        } 

        /**
         * hotelID
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * updateHotelSceneBookReq
         */
        public Builder updateHotelSceneBookReq(UpdateHotelSceneBookReq updateHotelSceneBookReq) {
            String updateHotelSceneBookReqShrink = shrink(updateHotelSceneBookReq, "UpdateHotelSceneBookReq", "json");
            this.putQueryParameter("UpdateHotelSceneBookReq", updateHotelSceneBookReqShrink);
            this.updateHotelSceneBookReq = updateHotelSceneBookReq;
            return this;
        }

        @Override
        public UpdateHotelSceneBookItemRequest build() {
            return new UpdateHotelSceneBookItemRequest(this);
        } 

    } 

    public static class UpdateHotelSceneBookReq extends TeaModel {
        @NameInMap("Icon")
        @Validation(required = true)
        private String icon;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Price")
        @Validation(required = true)
        private Long price;

        private UpdateHotelSceneBookReq(Builder builder) {
            this.icon = builder.icon;
            this.id = builder.id;
            this.name = builder.name;
            this.price = builder.price;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateHotelSceneBookReq create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        public static final class Builder {
            private String icon; 
            private Long id; 
            private String name; 
            private Long price; 

            /**
             * icon
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            public UpdateHotelSceneBookReq build() {
                return new UpdateHotelSceneBookReq(this);
            } 

        } 

    }
}
