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
 * {@link ListGatewayQuotaRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayQuotaRulesResponseBody</p>
 */
public class ListGatewayQuotaRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGatewayQuotaRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayQuotaRulesResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewayQuotaRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListGatewayQuotaRulesResponseBody build() {
            return new ListGatewayQuotaRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayQuotaRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayQuotaRulesResponseBody</p>
     */
    public static class Items extends TeaModel {
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
             * periodType.
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * quotaDimension.
             */
            public Builder quotaDimension(String quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * quotaLimit.
             */
            public Builder quotaLimit(Long quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * ruleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * ruleStatus.
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * windowAlignment.
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
     * {@link ListGatewayQuotaRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayQuotaRulesResponseBody</p>
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
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * totalSize.
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
