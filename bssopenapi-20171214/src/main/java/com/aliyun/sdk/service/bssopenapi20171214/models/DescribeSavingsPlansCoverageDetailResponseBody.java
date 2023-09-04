// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSavingsPlansCoverageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansCoverageDetailResponseBody</p>
 */
public class DescribeSavingsPlansCoverageDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSavingsPlansCoverageDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansCoverageDetailResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private Boolean success; 

        /**
         * The message returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The total number of entries.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the operation was successful.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The return data.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSavingsPlansCoverageDetailResponseBody build() {
            return new DescribeSavingsPlansCoverageDetailResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CoveragePercentage")
        private Float coveragePercentage;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DeductAmount")
        private Float deductAmount;

        @NameInMap("EndPeriod")
        private String endPeriod;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("PostpaidCost")
        private Float postpaidCost;

        @NameInMap("Region")
        private String region;

        @NameInMap("StartPeriod")
        private String startPeriod;

        @NameInMap("TotalAmount")
        private Float totalAmount;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserName")
        private String userName;

        private Items(Builder builder) {
            this.coveragePercentage = builder.coveragePercentage;
            this.currency = builder.currency;
            this.deductAmount = builder.deductAmount;
            this.endPeriod = builder.endPeriod;
            this.instanceId = builder.instanceId;
            this.instanceSpec = builder.instanceSpec;
            this.postpaidCost = builder.postpaidCost;
            this.region = builder.region;
            this.startPeriod = builder.startPeriod;
            this.totalAmount = builder.totalAmount;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return coveragePercentage
         */
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return deductAmount
         */
        public Float getDeductAmount() {
            return this.deductAmount;
        }

        /**
         * @return endPeriod
         */
        public String getEndPeriod() {
            return this.endPeriod;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return postpaidCost
         */
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return startPeriod
         */
        public String getStartPeriod() {
            return this.startPeriod;
        }

        /**
         * @return totalAmount
         */
        public Float getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Float coveragePercentage; 
            private String currency; 
            private Float deductAmount; 
            private String endPeriod; 
            private String instanceId; 
            private String instanceSpec; 
            private Float postpaidCost; 
            private String region; 
            private String startPeriod; 
            private Float totalAmount; 
            private Long userId; 
            private String userName; 

            /**
             * The region.
             */
            public Builder coveragePercentage(Float coveragePercentage) {
                this.coveragePercentage = coveragePercentage;
                return this;
            }

            /**
             * The specifications.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The start time.
             */
            public Builder deductAmount(Float deductAmount) {
                this.deductAmount = deductAmount;
                return this;
            }

            /**
             * EndPeriod.
             */
            public Builder endPeriod(String endPeriod) {
                this.endPeriod = endPeriod;
                return this;
            }

            /**
             * The currency.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The pay-as-you-go cost.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * The coverage.
             */
            public Builder postpaidCost(Float postpaidCost) {
                this.postpaidCost = postpaidCost;
                return this;
            }

            /**
             * The deducted amount.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The total expenditure.
             */
            public Builder startPeriod(String startPeriod) {
                this.startPeriod = startPeriod;
                return this;
            }

            /**
             * The username of the account.
             */
            public Builder totalAmount(Float totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The end time.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.items = builder.items;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
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
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * The ID of the account.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The data entries.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The token of the next page.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
