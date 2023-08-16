// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeAuctionRequest} extends {@link RequestModel}
 *
 * <p>ChangeAuctionRequest</p>
 */
public class ChangeAuctionRequest extends Request {
    @Body
    @NameInMap("AuctionList")
    private java.util.List < AuctionList> auctionList;

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
    public java.util.List < AuctionList> getAuctionList() {
        return this.auctionList;
    }

    public static final class Builder extends Request.Builder<ChangeAuctionRequest, Builder> {
        private java.util.List < AuctionList> auctionList; 

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
        public Builder auctionList(java.util.List < AuctionList> auctionList) {
            this.putBodyParameter("AuctionList", auctionList);
            this.auctionList = auctionList;
            return this;
        }

        @Override
        public ChangeAuctionRequest build() {
            return new ChangeAuctionRequest(this);
        } 

    } 

    public static class BidRecords extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        private String createTime;

        @NameInMap("Price")
        @Validation(required = true)
        private Float price;

        @NameInMap("UserId")
        @Validation(required = true)
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

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * UserId.
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
    public static class AuctionList extends TeaModel {
        @NameInMap("BidRecords")
        private java.util.List < BidRecords> bidRecords;

        @NameInMap("DomainName")
        @Validation(required = true)
        private String domainName;

        @NameInMap("EndTime")
        @Validation(required = true)
        private String endTime;

        @NameInMap("IsReserve")
        private Integer isReserve;

        @NameInMap("ReservePrice")
        private Float reservePrice;

        @NameInMap("ReserveRange")
        private String reserveRange;

        @NameInMap("Status")
        private String status;

        @NameInMap("TimeLeft")
        private Long timeLeft;

        @NameInMap("Winner")
        @Validation(required = true)
        private String winner;

        @NameInMap("WinnerPrice")
        @Validation(required = true)
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
        public java.util.List < BidRecords> getBidRecords() {
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
            private java.util.List < BidRecords> bidRecords; 
            private String domainName; 
            private String endTime; 
            private Integer isReserve; 
            private Float reservePrice; 
            private String reserveRange; 
            private String status; 
            private Long timeLeft; 
            private String winner; 
            private Float winnerPrice; 

            /**
             * BidRecords.
             */
            public Builder bidRecords(java.util.List < BidRecords> bidRecords) {
                this.bidRecords = bidRecords;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * EndTime.
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
             * Winner.
             */
            public Builder winner(String winner) {
                this.winner = winner;
                return this;
            }

            /**
             * WinnerPrice.
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
