// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeMOTokenUsageSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMOTokenUsageSummaryResponseBody</p>
 */
public class DescribeMOTokenUsageSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private Summary summary;

    @com.aliyun.core.annotation.NameInMap("UsageType")
    private String usageType;

    private DescribeMOTokenUsageSummaryResponseBody(Builder builder) {
        this.message = builder.message;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.summary = builder.summary;
        this.usageType = builder.usageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMOTokenUsageSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
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

    /**
     * @return summary
     */
    public Summary getSummary() {
        return this.summary;
    }

    /**
     * @return usageType
     */
    public String getUsageType() {
        return this.usageType;
    }

    public static final class Builder {
        private String message; 
        private java.util.List<Records> records; 
        private String requestId; 
        private Boolean success; 
        private Summary summary; 
        private String usageType; 

        private Builder() {
        } 

        private Builder(DescribeMOTokenUsageSummaryResponseBody model) {
            this.message = model.message;
            this.records = model.records;
            this.requestId = model.requestId;
            this.success = model.success;
            this.summary = model.summary;
            this.usageType = model.usageType;
        } 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Records.
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
            return this;
        }

        /**
         * UsageType.
         */
        public Builder usageType(String usageType) {
            this.usageType = usageType;
            return this;
        }

        public DescribeMOTokenUsageSummaryResponseBody build() {
            return new DescribeMOTokenUsageSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMOTokenUsageSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMOTokenUsageSummaryResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("CacheTokens")
        private Double cacheTokens;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Double inputTokens;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Double outputTokens;

        @com.aliyun.core.annotation.NameInMap("RequestCount")
        private Long requestCount;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Double totalTokens;

        @com.aliyun.core.annotation.NameInMap("UsageType")
        private String usageType;

        private Records(Builder builder) {
            this.apiKey = builder.apiKey;
            this.cacheTokens = builder.cacheTokens;
            this.date = builder.date;
            this.inputTokens = builder.inputTokens;
            this.keyName = builder.keyName;
            this.model = builder.model;
            this.outputTokens = builder.outputTokens;
            this.requestCount = builder.requestCount;
            this.totalTokens = builder.totalTokens;
            this.usageType = builder.usageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return cacheTokens
         */
        public Double getCacheTokens() {
            return this.cacheTokens;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return inputTokens
         */
        public Double getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return outputTokens
         */
        public Double getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return requestCount
         */
        public Long getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return totalTokens
         */
        public Double getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return usageType
         */
        public String getUsageType() {
            return this.usageType;
        }

        public static final class Builder {
            private String apiKey; 
            private Double cacheTokens; 
            private String date; 
            private Double inputTokens; 
            private String keyName; 
            private String model; 
            private Double outputTokens; 
            private Long requestCount; 
            private Double totalTokens; 
            private String usageType; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.apiKey = model.apiKey;
                this.cacheTokens = model.cacheTokens;
                this.date = model.date;
                this.inputTokens = model.inputTokens;
                this.keyName = model.keyName;
                this.model = model.model;
                this.outputTokens = model.outputTokens;
                this.requestCount = model.requestCount;
                this.totalTokens = model.totalTokens;
                this.usageType = model.usageType;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * CacheTokens.
             */
            public Builder cacheTokens(Double cacheTokens) {
                this.cacheTokens = cacheTokens;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * InputTokens.
             */
            public Builder inputTokens(Double inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Double outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * RequestCount.
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Double totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * UsageType.
             */
            public Builder usageType(String usageType) {
                this.usageType = usageType;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMOTokenUsageSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMOTokenUsageSummaryResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheTokens")
        private Double cacheTokens;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Double inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Double outputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Double totalTokens;

        private Summary(Builder builder) {
            this.cacheTokens = builder.cacheTokens;
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return cacheTokens
         */
        public Double getCacheTokens() {
            return this.cacheTokens;
        }

        /**
         * @return inputTokens
         */
        public Double getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Double getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Double getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Double cacheTokens; 
            private Double inputTokens; 
            private Double outputTokens; 
            private Double totalTokens; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.cacheTokens = model.cacheTokens;
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * CacheTokens.
             */
            public Builder cacheTokens(Double cacheTokens) {
                this.cacheTokens = cacheTokens;
                return this;
            }

            /**
             * InputTokens.
             */
            public Builder inputTokens(Double inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Double outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Double totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
}
