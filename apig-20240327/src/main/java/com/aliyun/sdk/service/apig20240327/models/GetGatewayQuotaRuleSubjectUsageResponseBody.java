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
 * {@link GetGatewayQuotaRuleSubjectUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayQuotaRuleSubjectUsageResponseBody</p>
 */
public class GetGatewayQuotaRuleSubjectUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGatewayQuotaRuleSubjectUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayQuotaRuleSubjectUsageResponseBody create() {
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

        private Builder(GetGatewayQuotaRuleSubjectUsageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
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
         * message.
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

        public GetGatewayQuotaRuleSubjectUsageResponseBody build() {
            return new GetGatewayQuotaRuleSubjectUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayQuotaRuleSubjectUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleSubjectUsageResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cachedAmount")
        private Long cachedAmount;

        @com.aliyun.core.annotation.NameInMap("inputAmount")
        private Long inputAmount;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("outputAmount")
        private Long outputAmount;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("usedAmount")
        private Long usedAmount;

        private Items(Builder builder) {
            this.cachedAmount = builder.cachedAmount;
            this.inputAmount = builder.inputAmount;
            this.model = builder.model;
            this.outputAmount = builder.outputAmount;
            this.startTime = builder.startTime;
            this.usedAmount = builder.usedAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cachedAmount
         */
        public Long getCachedAmount() {
            return this.cachedAmount;
        }

        /**
         * @return inputAmount
         */
        public Long getInputAmount() {
            return this.inputAmount;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return outputAmount
         */
        public Long getOutputAmount() {
            return this.outputAmount;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return usedAmount
         */
        public Long getUsedAmount() {
            return this.usedAmount;
        }

        public static final class Builder {
            private Long cachedAmount; 
            private Long inputAmount; 
            private String model; 
            private Long outputAmount; 
            private String startTime; 
            private Long usedAmount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.cachedAmount = model.cachedAmount;
                this.inputAmount = model.inputAmount;
                this.model = model.model;
                this.outputAmount = model.outputAmount;
                this.startTime = model.startTime;
                this.usedAmount = model.usedAmount;
            } 

            /**
             * cachedAmount.
             */
            public Builder cachedAmount(Long cachedAmount) {
                this.cachedAmount = cachedAmount;
                return this;
            }

            /**
             * inputAmount.
             */
            public Builder inputAmount(Long inputAmount) {
                this.inputAmount = inputAmount;
                return this;
            }

            /**
             * model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * outputAmount.
             */
            public Builder outputAmount(Long outputAmount) {
                this.outputAmount = outputAmount;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * usedAmount.
             */
            public Builder usedAmount(Long usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayQuotaRuleSubjectUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleSubjectUsageResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private Details(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
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

            private Builder(Details model) {
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

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayQuotaRuleSubjectUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleSubjectUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cachedAmount")
        private Long cachedAmount;

        @com.aliyun.core.annotation.NameInMap("details")
        private Details details;

        @com.aliyun.core.annotation.NameInMap("inputAmount")
        private Long inputAmount;

        @com.aliyun.core.annotation.NameInMap("outputAmount")
        private Long outputAmount;

        @com.aliyun.core.annotation.NameInMap("overLimit")
        private Boolean overLimit;

        @com.aliyun.core.annotation.NameInMap("totalQuota")
        private Long totalQuota;

        @com.aliyun.core.annotation.NameInMap("usedAmount")
        private Long usedAmount;

        private Data(Builder builder) {
            this.cachedAmount = builder.cachedAmount;
            this.details = builder.details;
            this.inputAmount = builder.inputAmount;
            this.outputAmount = builder.outputAmount;
            this.overLimit = builder.overLimit;
            this.totalQuota = builder.totalQuota;
            this.usedAmount = builder.usedAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cachedAmount
         */
        public Long getCachedAmount() {
            return this.cachedAmount;
        }

        /**
         * @return details
         */
        public Details getDetails() {
            return this.details;
        }

        /**
         * @return inputAmount
         */
        public Long getInputAmount() {
            return this.inputAmount;
        }

        /**
         * @return outputAmount
         */
        public Long getOutputAmount() {
            return this.outputAmount;
        }

        /**
         * @return overLimit
         */
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        /**
         * @return totalQuota
         */
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return usedAmount
         */
        public Long getUsedAmount() {
            return this.usedAmount;
        }

        public static final class Builder {
            private Long cachedAmount; 
            private Details details; 
            private Long inputAmount; 
            private Long outputAmount; 
            private Boolean overLimit; 
            private Long totalQuota; 
            private Long usedAmount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cachedAmount = model.cachedAmount;
                this.details = model.details;
                this.inputAmount = model.inputAmount;
                this.outputAmount = model.outputAmount;
                this.overLimit = model.overLimit;
                this.totalQuota = model.totalQuota;
                this.usedAmount = model.usedAmount;
            } 

            /**
             * cachedAmount.
             */
            public Builder cachedAmount(Long cachedAmount) {
                this.cachedAmount = cachedAmount;
                return this;
            }

            /**
             * details.
             */
            public Builder details(Details details) {
                this.details = details;
                return this;
            }

            /**
             * inputAmount.
             */
            public Builder inputAmount(Long inputAmount) {
                this.inputAmount = inputAmount;
                return this;
            }

            /**
             * outputAmount.
             */
            public Builder outputAmount(Long outputAmount) {
                this.outputAmount = outputAmount;
                return this;
            }

            /**
             * overLimit.
             */
            public Builder overLimit(Boolean overLimit) {
                this.overLimit = overLimit;
                return this;
            }

            /**
             * totalQuota.
             */
            public Builder totalQuota(Long totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * usedAmount.
             */
            public Builder usedAmount(Long usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
