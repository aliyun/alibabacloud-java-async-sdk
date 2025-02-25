// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link DescribeSavingsPlansUsageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansUsageDetailResponseBody</p>
 */
public class DescribeSavingsPlansUsageDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSavingsPlansUsageDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansUsageDetailResponseBody create() {
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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSavingsPlansUsageDetailResponseBody build() {
            return new DescribeSavingsPlansUsageDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSavingsPlansUsageDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansUsageDetailResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DeductValue")
        private Float deductValue;

        @com.aliyun.core.annotation.NameInMap("EndPeriod")
        private String endPeriod;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PoolValue")
        private Float poolValue;

        @com.aliyun.core.annotation.NameInMap("PostpaidCost")
        private Float postpaidCost;

        @com.aliyun.core.annotation.NameInMap("SavedCost")
        private Float savedCost;

        @com.aliyun.core.annotation.NameInMap("StartPeriod")
        private String startPeriod;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UsagePercentage")
        private Float usagePercentage;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Items(Builder builder) {
            this.currency = builder.currency;
            this.deductValue = builder.deductValue;
            this.endPeriod = builder.endPeriod;
            this.instanceId = builder.instanceId;
            this.poolValue = builder.poolValue;
            this.postpaidCost = builder.postpaidCost;
            this.savedCost = builder.savedCost;
            this.startPeriod = builder.startPeriod;
            this.status = builder.status;
            this.type = builder.type;
            this.usagePercentage = builder.usagePercentage;
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
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return deductValue
         */
        public Float getDeductValue() {
            return this.deductValue;
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
         * @return poolValue
         */
        public Float getPoolValue() {
            return this.poolValue;
        }

        /**
         * @return postpaidCost
         */
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        /**
         * @return savedCost
         */
        public Float getSavedCost() {
            return this.savedCost;
        }

        /**
         * @return startPeriod
         */
        public String getStartPeriod() {
            return this.startPeriod;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usagePercentage
         */
        public Float getUsagePercentage() {
            return this.usagePercentage;
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
            private String currency; 
            private Float deductValue; 
            private String endPeriod; 
            private String instanceId; 
            private Float poolValue; 
            private Float postpaidCost; 
            private Float savedCost; 
            private String startPeriod; 
            private String status; 
            private String type; 
            private Float usagePercentage; 
            private Long userId; 
            private String userName; 

            /**
             * <p>The currency.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The used amount of the savings plan.</p>
             * 
             * <strong>example:</strong>
             * <p>3.94</p>
             */
            public Builder deductValue(Float deductValue) {
                this.deductValue = deductValue;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-09 00:00:00</p>
             */
            public Builder endPeriod(String endPeriod) {
                this.endPeriod = endPeriod;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>spn-a1fhs54c243hP22</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The total amount of the savings plan.</p>
             * 
             * <strong>example:</strong>
             * <p>29.84</p>
             */
            public Builder poolValue(Float poolValue) {
                this.poolValue = poolValue;
                return this;
            }

            /**
             * <p>The pay-as-you-go cost.</p>
             * 
             * <strong>example:</strong>
             * <p>4.2</p>
             */
            public Builder postpaidCost(Float postpaidCost) {
                this.postpaidCost = postpaidCost;
                return this;
            }

            /**
             * <p>The amount that is saved.</p>
             * 
             * <strong>example:</strong>
             * <p>0.08</p>
             */
            public Builder savedCost(Float savedCost) {
                this.savedCost = savedCost;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-01 00:00:00</p>
             */
            public Builder startPeriod(String startPeriod) {
                this.startPeriod = startPeriod;
                return this;
            }

            /**
             * <p>The status of the instance.</p>
             * <p>A value of -1 indicates that the payment is overdue. A value of 1 indicates that the instance is active.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the savings plan. Valid values: universal and ECS compute.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The usage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder usagePercentage(Float usagePercentage) {
                this.usagePercentage = usagePercentage;
                return this;
            }

            /**
             * <p>The ID of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>123745698925000</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username of the account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test13@test.aliyun.com">test13@test.aliyun.com</a></p>
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
    /**
     * 
     * {@link DescribeSavingsPlansUsageDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansUsageDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<Items> getItems() {
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
            private java.util.List<Items> items; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * <p>The data entries.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The token of the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2ldhsSI6MTB9</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
