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
 * {@link UpdateHotelSceneBookItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateHotelSceneBookItemRequest</p>
 */
public class UpdateHotelSceneBookItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateHotelSceneBookReq")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>updateHotelSceneBookReq</p>
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link UpdateHotelSceneBookItemRequest} extends {@link TeaModel}
     *
     * <p>UpdateHotelSceneBookItemRequest</p>
     */
    public static class UpdateHotelSceneBookReq extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Icon")
        @com.aliyun.core.annotation.Validation(required = true)
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Price")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(UpdateHotelSceneBookReq model) {
                this.icon = model.icon;
                this.id = model.id;
                this.name = model.name;
                this.price = model.price;
            } 

            /**
             * <p>icon</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ailabs.alibabausercontent.com/platform/28d7a91e3c05db3855725fc39e0387e7/welcome_audios/aa918294b6ca3aa115c51135bf9b80cb/l9f996sq.png">https://ailabs.alibabausercontent.com/platform/28d7a91e3c05db3855725fc39e0387e7/welcome_audios/aa918294b6ca3aa115c51135bf9b80cb/l9f996sq.png</a></p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1250</p>
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
