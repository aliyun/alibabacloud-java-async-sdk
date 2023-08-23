// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertHotelSceneBookItemRequest} extends {@link RequestModel}
 *
 * <p>InsertHotelSceneBookItemRequest</p>
 */
public class InsertHotelSceneBookItemRequest extends Request {
    @Query
    @NameInMap("AddHotelSceneItemReq")
    @Validation(required = true)
    private AddHotelSceneItemReq addHotelSceneItemReq;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    private InsertHotelSceneBookItemRequest(Builder builder) {
        super(builder);
        this.addHotelSceneItemReq = builder.addHotelSceneItemReq;
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertHotelSceneBookItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addHotelSceneItemReq
     */
    public AddHotelSceneItemReq getAddHotelSceneItemReq() {
        return this.addHotelSceneItemReq;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    public static final class Builder extends Request.Builder<InsertHotelSceneBookItemRequest, Builder> {
        private AddHotelSceneItemReq addHotelSceneItemReq; 
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(InsertHotelSceneBookItemRequest request) {
            super(request);
            this.addHotelSceneItemReq = request.addHotelSceneItemReq;
            this.hotelId = request.hotelId;
        } 

        /**
         * addHotelSceneItemReq
         */
        public Builder addHotelSceneItemReq(AddHotelSceneItemReq addHotelSceneItemReq) {
            String addHotelSceneItemReqShrink = shrink(addHotelSceneItemReq, "AddHotelSceneItemReq", "json");
            this.putQueryParameter("AddHotelSceneItemReq", addHotelSceneItemReqShrink);
            this.addHotelSceneItemReq = addHotelSceneItemReq;
            return this;
        }

        /**
         * hotelID
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        @Override
        public InsertHotelSceneBookItemRequest build() {
            return new InsertHotelSceneBookItemRequest(this);
        } 

    } 

    public static class AddHotelSceneItemReq extends TeaModel {
        @NameInMap("Icon")
        @Validation(required = true)
        private String icon;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Price")
        @Validation(required = true)
        private Long price;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private AddHotelSceneItemReq(Builder builder) {
            this.icon = builder.icon;
            this.name = builder.name;
            this.price = builder.price;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddHotelSceneItemReq create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String icon; 
            private String name; 
            private Long price; 
            private String type; 

            /**
             * icon
             */
            public Builder icon(String icon) {
                this.icon = icon;
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

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AddHotelSceneItemReq build() {
                return new AddHotelSceneItemReq(this);
            } 

        } 

    }
}
