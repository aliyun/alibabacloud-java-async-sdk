// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncCardInfoRequest} extends {@link RequestModel}
 *
 * <p>SyncCardInfoRequest</p>
 */
public class SyncCardInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private SyncCardInfoRequestBody body;

    private SyncCardInfoRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncCardInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public SyncCardInfoRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SyncCardInfoRequest, Builder> {
        private SyncCardInfoRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(SyncCardInfoRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(SyncCardInfoRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public SyncCardInfoRequest build() {
            return new SyncCardInfoRequest(this);
        } 

    } 

    public static class Gifters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderImg")
        private String headerImg;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("OpenId")
        private String openId;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        private Gifters(Builder builder) {
            this.headerImg = builder.headerImg;
            this.id = builder.id;
            this.nickname = builder.nickname;
            this.openId = builder.openId;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gifters create() {
            return builder().build();
        }

        /**
         * @return headerImg
         */
        public String getHeaderImg() {
            return this.headerImg;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return openId
         */
        public String getOpenId() {
            return this.openId;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String headerImg; 
            private String id; 
            private String nickname; 
            private String openId; 
            private String phone; 

            /**
             * HeaderImg.
             */
            public Builder headerImg(String headerImg) {
                this.headerImg = headerImg;
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
             * Nickname.
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * openId
             */
            public Builder openId(String openId) {
                this.openId = openId;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Gifters build() {
                return new Gifters(this);
            } 

        } 

    }
    public static class PresentDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private String skuId;

        private PresentDetail(Builder builder) {
            this.count = builder.count;
            this.itemId = builder.itemId;
            this.name = builder.name;
            this.price = builder.price;
            this.skuId = builder.skuId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PresentDetail create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
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
        public Double getPrice() {
            return this.price;
        }

        /**
         * @return skuId
         */
        public String getSkuId() {
            return this.skuId;
        }

        public static final class Builder {
            private Long count; 
            private String itemId; 
            private String name; 
            private Double price; 
            private String skuId; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
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
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            public PresentDetail build() {
                return new PresentDetail(this);
            } 

        } 

    }
    public static class Recipient extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderImg")
        private String headerImg;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("OpenId")
        private String openId;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        private Recipient(Builder builder) {
            this.headerImg = builder.headerImg;
            this.id = builder.id;
            this.nickname = builder.nickname;
            this.openId = builder.openId;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recipient create() {
            return builder().build();
        }

        /**
         * @return headerImg
         */
        public String getHeaderImg() {
            return this.headerImg;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return openId
         */
        public String getOpenId() {
            return this.openId;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String headerImg; 
            private String id; 
            private String nickname; 
            private String openId; 
            private String phone; 

            /**
             * HeaderImg.
             */
            public Builder headerImg(String headerImg) {
                this.headerImg = headerImg;
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
             * Nickname.
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * openId
             */
            public Builder openId(String openId) {
                this.openId = openId;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Recipient build() {
                return new Recipient(this);
            } 

        } 

    }
    public static class SyncCardInfoRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuyerId")
        private String buyerId;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Gifters")
        private Gifters gifters;

        @com.aliyun.core.annotation.NameInMap("OccurredAt")
        private String occurredAt;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("PresentDetail")
        private java.util.List < PresentDetail> presentDetail;

        @com.aliyun.core.annotation.NameInMap("ReceivedAt")
        private String receivedAt;

        @com.aliyun.core.annotation.NameInMap("Recipient")
        private Recipient recipient;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Theme")
        private String theme;

        @com.aliyun.core.annotation.NameInMap("TransferId")
        private String transferId;

        @com.aliyun.core.annotation.NameInMap("TransferredAt")
        private String transferredAt;

        private SyncCardInfoRequestBody(Builder builder) {
            this.buyerId = builder.buyerId;
            this.extra = builder.extra;
            this.gifters = builder.gifters;
            this.occurredAt = builder.occurredAt;
            this.openMerchantId = builder.openMerchantId;
            this.orderId = builder.orderId;
            this.presentDetail = builder.presentDetail;
            this.receivedAt = builder.receivedAt;
            this.recipient = builder.recipient;
            this.status = builder.status;
            this.theme = builder.theme;
            this.transferId = builder.transferId;
            this.transferredAt = builder.transferredAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncCardInfoRequestBody create() {
            return builder().build();
        }

        /**
         * @return buyerId
         */
        public String getBuyerId() {
            return this.buyerId;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return gifters
         */
        public Gifters getGifters() {
            return this.gifters;
        }

        /**
         * @return occurredAt
         */
        public String getOccurredAt() {
            return this.occurredAt;
        }

        /**
         * @return openMerchantId
         */
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return presentDetail
         */
        public java.util.List < PresentDetail> getPresentDetail() {
            return this.presentDetail;
        }

        /**
         * @return receivedAt
         */
        public String getReceivedAt() {
            return this.receivedAt;
        }

        /**
         * @return recipient
         */
        public Recipient getRecipient() {
            return this.recipient;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return theme
         */
        public String getTheme() {
            return this.theme;
        }

        /**
         * @return transferId
         */
        public String getTransferId() {
            return this.transferId;
        }

        /**
         * @return transferredAt
         */
        public String getTransferredAt() {
            return this.transferredAt;
        }

        public static final class Builder {
            private String buyerId; 
            private String extra; 
            private Gifters gifters; 
            private String occurredAt; 
            private String openMerchantId; 
            private String orderId; 
            private java.util.List < PresentDetail> presentDetail; 
            private String receivedAt; 
            private Recipient recipient; 
            private String status; 
            private String theme; 
            private String transferId; 
            private String transferredAt; 

            /**
             * BuyerId.
             */
            public Builder buyerId(String buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * Gifters.
             */
            public Builder gifters(Gifters gifters) {
                this.gifters = gifters;
                return this;
            }

            /**
             * OccurredAt.
             */
            public Builder occurredAt(String occurredAt) {
                this.occurredAt = occurredAt;
                return this;
            }

            /**
             * OpenMerchantId.
             */
            public Builder openMerchantId(String openMerchantId) {
                this.openMerchantId = openMerchantId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * PresentDetail.
             */
            public Builder presentDetail(java.util.List < PresentDetail> presentDetail) {
                this.presentDetail = presentDetail;
                return this;
            }

            /**
             * ReceivedAt.
             */
            public Builder receivedAt(String receivedAt) {
                this.receivedAt = receivedAt;
                return this;
            }

            /**
             * Recipient.
             */
            public Builder recipient(Recipient recipient) {
                this.recipient = recipient;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Theme.
             */
            public Builder theme(String theme) {
                this.theme = theme;
                return this;
            }

            /**
             * TransferId.
             */
            public Builder transferId(String transferId) {
                this.transferId = transferId;
                return this;
            }

            /**
             * TransferredAt.
             */
            public Builder transferredAt(String transferredAt) {
                this.transferredAt = transferredAt;
                return this;
            }

            public SyncCardInfoRequestBody build() {
                return new SyncCardInfoRequestBody(this);
            } 

        } 

    }
}
