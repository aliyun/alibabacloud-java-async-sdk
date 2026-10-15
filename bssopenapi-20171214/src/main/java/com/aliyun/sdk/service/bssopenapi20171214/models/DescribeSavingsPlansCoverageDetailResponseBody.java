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
 * {@link DescribeSavingsPlansCoverageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansCoverageDetailResponseBody</p>
 */
public class DescribeSavingsPlansCoverageDetailResponseBody extends TeaModel {
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

        private Builder() {
        } 

        private Builder(DescribeSavingsPlansCoverageDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned query data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSavingsPlansCoverageDetailResponseBody build() {
            return new DescribeSavingsPlansCoverageDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSavingsPlansCoverageDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageDetailResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoveragePercentage")
        private Float coveragePercentage;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DeductAmount")
        private Float deductAmount;

        @com.aliyun.core.annotation.NameInMap("EndPeriod")
        private String endPeriod;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("PostpaidCost")
        private Float postpaidCost;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("StartPeriod")
        private String startPeriod;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private Float totalAmount;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Items(Builder builder) {
            this.coveragePercentage = builder.coveragePercentage;
            this.currency = builder.currency;
            this.deductAmount = builder.deductAmount;
            this.endPeriod = builder.endPeriod;
            this.instanceId = builder.instanceId;
            this.instanceSpec = builder.instanceSpec;
            this.ownerId = builder.ownerId;
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
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
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
            private Long ownerId; 
            private Float postpaidCost; 
            private String region; 
            private String startPeriod; 
            private Float totalAmount; 
            private Long userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.coveragePercentage = model.coveragePercentage;
                this.currency = model.currency;
                this.deductAmount = model.deductAmount;
                this.endPeriod = model.endPeriod;
                this.instanceId = model.instanceId;
                this.instanceSpec = model.instanceSpec;
                this.ownerId = model.ownerId;
                this.postpaidCost = model.postpaidCost;
                this.region = model.region;
                this.startPeriod = model.startPeriod;
                this.totalAmount = model.totalAmount;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>The coverage percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder coveragePercentage(Float coveragePercentage) {
                this.coveragePercentage = coveragePercentage;
                return this;
            }

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
             * <p>The deducted amount.</p>
             * 
             * <strong>example:</strong>
             * <p>5.5</p>
             */
            public Builder deductAmount(Float deductAmount) {
                this.deductAmount = deductAmount;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-01 00:00:00</p>
             */
            public Builder endPeriod(String endPeriod) {
                this.endPeriod = endPeriod;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1d9x623987rlj0dx4xx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.sn1ne.3xlarge</p>
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The ID of the owner of the deducted commodity.</p>
             * 
             * <strong>example:</strong>
             * <p>1906589291020438</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The pay-as-you-go cost.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder postpaidCost(Float postpaidCost) {
                this.postpaidCost = postpaidCost;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01 00:00:00</p>
             */
            public Builder startPeriod(String startPeriod) {
                this.startPeriod = startPeriod;
                return this;
            }

            /**
             * <p>The total expenditure.</p>
             * 
             * <strong>example:</strong>
             * <p>6.11</p>
             */
            public Builder totalAmount(Float totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1906589291020438</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:xxx@test.aliyunid.com">xxx@test.aliyunid.com</a></p>
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
     * {@link DescribeSavingsPlansCoverageDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The data items.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The token for the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
