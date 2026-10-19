// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link GetSubscriptionStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionStatsResponseBody</p>
 */
public class GetSubscriptionStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSubscriptionStatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSubscriptionStatsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSubscriptionStatsResponseBody build() {
            return new GetSubscriptionStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSubscriptionStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionStatsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignedSeats")
        private Long assignedSeats;

        @com.aliyun.core.annotation.NameInMap("SeatCredits")
        private Double seatCredits;

        @com.aliyun.core.annotation.NameInMap("SeatRefreshTime")
        private Long seatRefreshTime;

        @com.aliyun.core.annotation.NameInMap("SeatRemainingCredits")
        private Double seatRemainingCredits;

        @com.aliyun.core.annotation.NameInMap("SeatType")
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("TotalSeats")
        private Long totalSeats;

        private Items(Builder builder) {
            this.assignedSeats = builder.assignedSeats;
            this.seatCredits = builder.seatCredits;
            this.seatRefreshTime = builder.seatRefreshTime;
            this.seatRemainingCredits = builder.seatRemainingCredits;
            this.seatType = builder.seatType;
            this.totalSeats = builder.totalSeats;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return assignedSeats
         */
        public Long getAssignedSeats() {
            return this.assignedSeats;
        }

        /**
         * @return seatCredits
         */
        public Double getSeatCredits() {
            return this.seatCredits;
        }

        /**
         * @return seatRefreshTime
         */
        public Long getSeatRefreshTime() {
            return this.seatRefreshTime;
        }

        /**
         * @return seatRemainingCredits
         */
        public Double getSeatRemainingCredits() {
            return this.seatRemainingCredits;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return totalSeats
         */
        public Long getTotalSeats() {
            return this.totalSeats;
        }

        public static final class Builder {
            private Long assignedSeats; 
            private Double seatCredits; 
            private Long seatRefreshTime; 
            private Double seatRemainingCredits; 
            private String seatType; 
            private Long totalSeats; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.assignedSeats = model.assignedSeats;
                this.seatCredits = model.seatCredits;
                this.seatRefreshTime = model.seatRefreshTime;
                this.seatRemainingCredits = model.seatRemainingCredits;
                this.seatType = model.seatType;
                this.totalSeats = model.totalSeats;
            } 

            /**
             * <p>The number of assigned seats.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder assignedSeats(Long assignedSeats) {
                this.assignedSeats = assignedSeats;
                return this;
            }

            /**
             * <p>The total credits quota for the seat.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder seatCredits(Double seatCredits) {
                this.seatCredits = seatCredits;
                return this;
            }

            /**
             * <p>The refresh time of the current cycle, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1781422734</p>
             */
            public Builder seatRefreshTime(Long seatRefreshTime) {
                this.seatRefreshTime = seatRefreshTime;
                return this;
            }

            /**
             * <p>The remaining credits for the current cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder seatRemainingCredits(Double seatRemainingCredits) {
                this.seatRemainingCredits = seatRemainingCredits;
                return this;
            }

            /**
             * <p>The seat type (specType). Valid values:</p>
             * <ul>
             * <li>standard: Standard seat.</li>
             * <li>pro: Pro seat.</li>
             * <li>max: Premium seat.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * <p>The total number of seats.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalSeats(Long totalSeats) {
                this.totalSeats = totalSeats;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("SubscriptionEndTime")
        private Long subscriptionEndTime;

        @com.aliyun.core.annotation.NameInMap("SubscriptionStartTime")
        private Long subscriptionStartTime;

        private Data(Builder builder) {
            this.items = builder.items;
            this.subscriptionEndTime = builder.subscriptionEndTime;
            this.subscriptionStartTime = builder.subscriptionStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return subscriptionEndTime
         */
        public Long getSubscriptionEndTime() {
            return this.subscriptionEndTime;
        }

        /**
         * @return subscriptionStartTime
         */
        public Long getSubscriptionStartTime() {
            return this.subscriptionStartTime;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Long subscriptionEndTime; 
            private Long subscriptionStartTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.subscriptionEndTime = model.subscriptionEndTime;
                this.subscriptionStartTime = model.subscriptionStartTime;
            } 

            /**
             * <p>The list of seat information, grouped by specType.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The subscription end time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1781422734</p>
             */
            public Builder subscriptionEndTime(Long subscriptionEndTime) {
                this.subscriptionEndTime = subscriptionEndTime;
                return this;
            }

            /**
             * <p>The subscription start time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1781422733</p>
             */
            public Builder subscriptionStartTime(Long subscriptionStartTime) {
                this.subscriptionStartTime = subscriptionStartTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
