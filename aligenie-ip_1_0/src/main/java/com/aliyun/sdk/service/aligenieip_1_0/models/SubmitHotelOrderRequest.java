// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitHotelOrderRequest} extends {@link RequestModel}
 *
 * <p>SubmitHotelOrderRequest</p>
 */
public class SubmitHotelOrderRequest extends Request {
    @Query
    @NameInMap("Payload")
    @Validation(required = true)
    private Payload payload;

    @Query
    @NameInMap("UserInfo")
    @Validation(required = true)
    private UserInfo userInfo;

    private SubmitHotelOrderRequest(Builder builder) {
        super(builder);
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitHotelOrderRequest create() {
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

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<SubmitHotelOrderRequest, Builder> {
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(SubmitHotelOrderRequest request) {
            super(request);
            this.payload = request.payload;
            this.userInfo = request.userInfo;
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

        /**
         * UserInfo.
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public SubmitHotelOrderRequest build() {
            return new SubmitHotelOrderRequest(this);
        } 

    } 

    public static class ItemList extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        private Long itemId;

        @NameInMap("Quantity")
        @Validation(required = true)
        private Long quantity;

        private ItemList(Builder builder) {
            this.itemId = builder.itemId;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private Long itemId; 
            private Long quantity; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
    public static class Payload extends TeaModel {
        @NameInMap("ItemList")
        @Validation(required = true)
        private java.util.List < ItemList> itemList;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Payload(Builder builder) {
            this.itemList = builder.itemList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return itemList
         */
        public java.util.List < ItemList> getItemList() {
            return this.itemList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ItemList> itemList; 
            private String type; 

            /**
             * ItemList.
             */
            public Builder itemList(java.util.List < ItemList> itemList) {
                this.itemList = itemList;
                return this;
            }

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
    public static class UserInfo extends TeaModel {
        @NameInMap("EncodeKey")
        @Validation(required = true)
        private String encodeKey;

        @NameInMap("EncodeType")
        @Validation(required = true)
        private String encodeType;

        @NameInMap("Id")
        @Validation(required = true)
        private String id;

        @NameInMap("IdType")
        @Validation(required = true)
        private String idType;

        @NameInMap("OrganizationId")
        private String organizationId;

        private UserInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            /**
             * EncodeKey.
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
