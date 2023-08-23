// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSceneCategoryRequest} extends {@link RequestModel}
 *
 * <p>ListSceneCategoryRequest</p>
 */
public class ListSceneCategoryRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ListSceneCategoryRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSceneCategoryRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListSceneCategoryRequest, Builder> {
        private String hotelId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListSceneCategoryRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.type = request.type;
        } 

        /**
         * hotelId
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListSceneCategoryRequest build() {
            return new ListSceneCategoryRequest(this);
        } 

    } 

}
