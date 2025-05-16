// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link ChangeAuctionRequest} extends {@link RequestModel}
 *
 * <p>ChangeAuctionRequest</p>
 */
public class ChangeAuctionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuctionList")
    private java.util.List<AuctionList> auctionList;

    private ChangeAuctionRequest(Builder builder) {
        super(builder);
        this.auctionList = builder.auctionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeAuctionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auctionList
     */
    public java.util.List<AuctionList> getAuctionList() {
        return this.auctionList;
    }

    public static final class Builder extends Request.Builder<ChangeAuctionRequest, Builder> {
        private java.util.List<AuctionList> auctionList; 

        private Builder() {
            super();
        } 

        private Builder(ChangeAuctionRequest request) {
            super(request);
            this.auctionList = request.auctionList;
        } 

        /**
         * AuctionList.
         */
        public Builder auctionList(java.util.List<AuctionList> auctionList) {
            this.putBodyParameter("AuctionList", auctionList);
            this.auctionList = auctionList;
            return this;
        }

        @Override
        public ChangeAuctionRequest build() {
            return new ChangeAuctionRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChangeAuctionRequest} extends {@link TeaModel}
     *
     * <p>ChangeAuctionRequest</p>
     */
    public static class BidRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Price")
        @com.aliyun.core.annotation.Validation(required = true)
        private Float price;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private BidRecords(Builder builder) {
            this.createTime = builder.createTime;
            this.price = builder.price;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BidRecords create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String createTime; 
            private Float price; 
            private String userId; 

            private Builder() {
            } 

            private Builder(BidRecords model) {
                this.createTime = model.createTime;
                this.price = model.price;
                this.userId = model.userId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public BidRecords build() {
                return new BidRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeAuctionRequest} extends {@link TeaModel}
     *
     * <p>ChangeAuctionRequest</p>
     */
    public static class AuctionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BidRecords")
        private java.util.List<BidRecords> bidRecords;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IsReserve")
        private Integer isReserve;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Float reservePrice;

        @com.aliyun.core.annotation.NameInMap("ReserveRange")
        private String reserveRange;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeLeft")
        private Long timeLeft;

        @com.aliyun.core.annotation.NameInMap("Winner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String winner;

        @com.aliyun.core.annotation.NameInMap("WinnerPrice")
        @com.aliyun.core.annotation.Validation(required = true)
        private Float winnerPrice;

        private AuctionList(Builder builder) {
            this.bidRecords = builder.bidRecords;
            this.domainName = builder.domainName;
            this.endTime = builder.endTime;
            this.isReserve = builder.isReserve;
            this.reservePrice = builder.reservePrice;
            this.reserveRange = builder.reserveRange;
            this.status = builder.status;
            this.timeLeft = builder.timeLeft;
            this.winner = builder.winner;
            this.winnerPrice = builder.winnerPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuctionList create() {
            return builder().build();
        }

        /**
         * @return bidRecords
         */
        public java.util.List<BidRecords> getBidRecords() {
            return this.bidRecords;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isReserve
         */
        public Integer getIsReserve() {
            return this.isReserve;
        }

        /**
         * @return reservePrice
         */
        public Float getReservePrice() {
            return this.reservePrice;
        }

        /**
         * @return reserveRange
         */
        public String getReserveRange() {
            return this.reserveRange;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeLeft
         */
        public Long getTimeLeft() {
            return this.timeLeft;
        }

        /**
         * @return winner
         */
        public String getWinner() {
            return this.winner;
        }

        /**
         * @return winnerPrice
         */
        public Float getWinnerPrice() {
            return this.winnerPrice;
        }

        public static final class Builder {
            private java.util.List<BidRecords> bidRecords; 
            private String domainName; 
            private String endTime; 
            private Integer isReserve; 
            private Float reservePrice; 
            private String reserveRange; 
            private String status; 
            private Long timeLeft; 
            private String winner; 
            private Float winnerPrice; 

            private Builder() {
            } 

            private Builder(AuctionList model) {
                this.bidRecords = model.bidRecords;
                this.domainName = model.domainName;
                this.endTime = model.endTime;
                this.isReserve = model.isReserve;
                this.reservePrice = model.reservePrice;
                this.reserveRange = model.reserveRange;
                this.status = model.status;
                this.timeLeft = model.timeLeft;
                this.winner = model.winner;
                this.winnerPrice = model.winnerPrice;
            } 

            /**
             * BidRecords.
             */
            public Builder bidRecords(java.util.List<BidRecords> bidRecords) {
                this.bidRecords = bidRecords;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IsReserve.
             */
            public Builder isReserve(Integer isReserve) {
                this.isReserve = isReserve;
                return this;
            }

            /**
             * ReservePrice.
             */
            public Builder reservePrice(Float reservePrice) {
                this.reservePrice = reservePrice;
                return this;
            }

            /**
             * ReserveRange.
             */
            public Builder reserveRange(String reserveRange) {
                this.reserveRange = reserveRange;
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
             * TimeLeft.
             */
            public Builder timeLeft(Long timeLeft) {
                this.timeLeft = timeLeft;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder winner(String winner) {
                this.winner = winner;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder winnerPrice(Float winnerPrice) {
                this.winnerPrice = winnerPrice;
                return this;
            }

            public AuctionList build() {
                return new AuctionList(this);
            } 

        } 

    }
}
