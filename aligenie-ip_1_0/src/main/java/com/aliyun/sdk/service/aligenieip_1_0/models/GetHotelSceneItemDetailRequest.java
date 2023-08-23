// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelSceneItemDetailRequest} extends {@link RequestModel}
 *
 * <p>GetHotelSceneItemDetailRequest</p>
 */
public class GetHotelSceneItemDetailRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("ItemId")
    private Long itemId;

    @Body
    @NameInMap("Name")
    private String name;

    private GetHotelSceneItemDetailRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.itemId = builder.itemId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelSceneItemDetailRequest create() {
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
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetHotelSceneItemDetailRequest, Builder> {
        private String hotelId; 
        private Long itemId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetHotelSceneItemDetailRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.itemId = request.itemId;
            this.name = request.name;
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
         * ItemId.
         */
        public Builder itemId(Long itemId) {
            this.putBodyParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetHotelSceneItemDetailRequest build() {
            return new GetHotelSceneItemDetailRequest(this);
        } 

    } 

}
