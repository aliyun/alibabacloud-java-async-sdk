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
 * {@link InsertHotelSceneBookItemRequest} extends {@link RequestModel}
 *
 * <p>InsertHotelSceneBookItemRequest</p>
 */
public class InsertHotelSceneBookItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddHotelSceneItemReq")
    @com.aliyun.core.annotation.Validation(required = true)
    private AddHotelSceneItemReq addHotelSceneItemReq;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>addHotelSceneItemReq</p>
         * <p>This parameter is required.</p>
         */
        public Builder addHotelSceneItemReq(AddHotelSceneItemReq addHotelSceneItemReq) {
            String addHotelSceneItemReqShrink = shrink(addHotelSceneItemReq, "AddHotelSceneItemReq", "json");
            this.putQueryParameter("AddHotelSceneItemReq", addHotelSceneItemReqShrink);
            this.addHotelSceneItemReq = addHotelSceneItemReq;
            return this;
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

        @Override
        public InsertHotelSceneBookItemRequest build() {
            return new InsertHotelSceneBookItemRequest(this);
        } 

    } 

    /**
     * 
     * {@link InsertHotelSceneBookItemRequest} extends {@link TeaModel}
     *
     * <p>InsertHotelSceneBookItemRequest</p>
     */
    public static class AddHotelSceneItemReq extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Icon")
        @com.aliyun.core.annotation.Validation(required = true)
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Price")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long price;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(AddHotelSceneItemReq model) {
                this.icon = model.icon;
                this.name = model.name;
                this.price = model.price;
                this.type = model.type;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>青椒肉丝</p>
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

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FOOD</p>
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
