// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link DeleteHotelSceneBookItemRequest} extends {@link RequestModel}
 *
 * <p>DeleteHotelSceneBookItemRequest</p>
 */
public class DeleteHotelSceneBookItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private DeleteHotelSceneBookItemRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHotelSceneBookItemRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteHotelSceneBookItemRequest, Builder> {
        private String hotelId; 
        private Long id; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHotelSceneBookItemRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.id = request.id;
            this.name = request.name;
        } 

        /**
         * <p>hotelID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
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
        public DeleteHotelSceneBookItemRequest build() {
            return new DeleteHotelSceneBookItemRequest(this);
        } 

    } 

}
