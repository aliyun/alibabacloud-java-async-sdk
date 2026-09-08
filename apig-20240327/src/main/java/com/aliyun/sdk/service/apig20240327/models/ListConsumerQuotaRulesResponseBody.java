// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListConsumerQuotaRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListConsumerQuotaRulesResponseBody</p>
 */
public class ListConsumerQuotaRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListConsumerQuotaRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumerQuotaRulesResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListConsumerQuotaRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;totalSize&quot;:100}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConsumerQuotaRulesResponseBody build() {
            return new ListConsumerQuotaRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConsumerQuotaRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumerQuotaRulesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("gatewayName")
        private String gatewayName;

        @com.aliyun.core.annotation.NameInMap("periodMultiplier")
        private String periodMultiplier;

        @com.aliyun.core.annotation.NameInMap("periodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("quotaDimension")
        private String quotaDimension;

        @com.aliyun.core.annotation.NameInMap("quotaLimit")
        private Long quotaLimit;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("windowAlignment")
        private String windowAlignment;

        private Items(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.gatewayName = builder.gatewayName;
            this.periodMultiplier = builder.periodMultiplier;
            this.periodType = builder.periodType;
            this.quotaDimension = builder.quotaDimension;
            this.quotaLimit = builder.quotaLimit;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.timezone = builder.timezone;
            this.windowAlignment = builder.windowAlignment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return periodMultiplier
         */
        public String getPeriodMultiplier() {
            return this.periodMultiplier;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        /**
         * @return quotaDimension
         */
        public String getQuotaDimension() {
            return this.quotaDimension;
        }

        /**
         * @return quotaLimit
         */
        public Long getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return windowAlignment
         */
        public String getWindowAlignment() {
            return this.windowAlignment;
        }

        public static final class Builder {
            private String gatewayId; 
            private String gatewayName; 
            private String periodMultiplier; 
            private String periodType; 
            private String quotaDimension; 
            private Long quotaLimit; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private String timezone; 
            private String windowAlignment; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.gatewayId = model.gatewayId;
                this.gatewayName = model.gatewayName;
                this.periodMultiplier = model.periodMultiplier;
                this.periodType = model.periodType;
                this.quotaDimension = model.quotaDimension;
                this.quotaLimit = model.quotaLimit;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.timezone = model.timezone;
                this.windowAlignment = model.windowAlignment;
            } 

            /**
             * <p>The ID of the gateway to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-123456</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The name of the gateway to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-gateway</p>
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * <p>The period multiplier, which specifies the number of periods after which the quota is reset. This parameter is returned only when the rule uses a custom cycle. Minimum value: 1. Maximum value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder periodMultiplier(String periodMultiplier) {
                this.periodMultiplier = periodMultiplier;
                return this;
            }

            /**
             * <p>The period type.</p>
             * 
             * <strong>example:</strong>
             * <p>week</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * <p>The quota dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>token</p>
             */
            public Builder quotaDimension(String quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * <p>The quota limit.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder quotaLimit(Long quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>qr-d8j7fpmm1hksxxxxxx</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>daily-token-limit</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The rule status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>The time zone corresponding to the calendar cycle, in UTC+x format.</p>
             * 
             * <strong>example:</strong>
             * <p>UTC+8</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The cycle type. Valid values:</p>
             * <ul>
             * <li>calendar: calendar cycle.</li>
             * <li>epoch: custom cycle.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>calendar</p>
             */
            public Builder windowAlignment(String windowAlignment) {
                this.windowAlignment = windowAlignment;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConsumerQuotaRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumerQuotaRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
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
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The list of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;ruleId&quot;:&quot;rule-001&quot;}]</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The current page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of configured quota rules.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
