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
 * {@link DescribeMOTokenUsageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMOTokenUsageDetailResponseBody</p>
 */
public class DescribeMOTokenUsageDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextCursor")
    private String nextCursor;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UsageType")
    private String usageType;

    private DescribeMOTokenUsageDetailResponseBody(Builder builder) {
        this.nextCursor = builder.nextCursor;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.usageType = builder.usageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMOTokenUsageDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextCursor
     */
    public String getNextCursor() {
        return this.nextCursor;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return usageType
     */
    public String getUsageType() {
        return this.usageType;
    }

    public static final class Builder {
        private String nextCursor; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List<Records> records; 
        private String requestId; 
        private Integer totalCount; 
        private String usageType; 

        private Builder() {
        } 

        private Builder(DescribeMOTokenUsageDetailResponseBody model) {
            this.nextCursor = model.nextCursor;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.records = model.records;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.usageType = model.usageType;
        } 

        /**
         * <p>The cursor for the next page. An empty value indicates that the current page is the last page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJpZCI6MTIzNDUsInRzIjoiMjAyNi0wNC0wOFQwMDowMDowMFoifQ==</p>
         */
        public Builder nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of records in the response.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records that match the query conditions. This parameter is optional and may not be returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The usage type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder usageType(String usageType) {
            this.usageType = usageType;
            return this;
        }

        public DescribeMOTokenUsageDetailResponseBody build() {
            return new DescribeMOTokenUsageDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMOTokenUsageDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMOTokenUsageDetailResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheTokens")
        private Double cacheTokens;

        @com.aliyun.core.annotation.NameInMap("ConsumerName")
        private String consumerName;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Double inputTokens;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Double outputTokens;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private String requestTime;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Double totalTokens;

        private Records(Builder builder) {
            this.cacheTokens = builder.cacheTokens;
            this.consumerName = builder.consumerName;
            this.extraInfo = builder.extraInfo;
            this.inputTokens = builder.inputTokens;
            this.instanceId = builder.instanceId;
            this.model = builder.model;
            this.outputTokens = builder.outputTokens;
            this.region = builder.region;
            this.requestTime = builder.requestTime;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return cacheTokens
         */
        public Double getCacheTokens() {
            return this.cacheTokens;
        }

        /**
         * @return consumerName
         */
        public String getConsumerName() {
            return this.consumerName;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return inputTokens
         */
        public Double getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return requestTime
         */
        public String getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return totalTokens
         */
        public Double getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Double cacheTokens; 
            private String consumerName; 
            private String extraInfo; 
            private Double inputTokens; 
            private String instanceId; 
            private String model; 
            private Double outputTokens; 
            private String region; 
            private String requestTime; 
            private Double totalTokens; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.cacheTokens = model.cacheTokens;
                this.consumerName = model.consumerName;
                this.extraInfo = model.extraInfo;
                this.inputTokens = model.inputTokens;
                this.instanceId = model.instanceId;
                this.model = model.model;
                this.outputTokens = model.outputTokens;
                this.region = model.region;
                this.requestTime = model.requestTime;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * <p>The number of input tokens that hit the cache.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder cacheTokens(Double cacheTokens) {
                this.cacheTokens = cacheTokens;
                return this;
            }

            /**
             * <p>The consumer associated with the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>16<strong><strong><strong>4_rds_copilot</strong></strong>_public_cn-4</strong>**02</p>
             */
            public Builder consumerName(String consumerName) {
                this.consumerName = consumerName;
                return this;
            }

            /**
             * <p>The additional information passed by the user in the extra_info field during the request. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;label&quot;: &quot;test&quot;}</p>
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The number of input tokens consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder inputTokens(Double inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_copilot***_public_cn-*********6</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The model that was called.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-flash</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The number of output tokens consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder outputTokens(Double outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The request time in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-01T01:00:00Z</p>
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * <p>The total number of tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder totalTokens(Double totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
