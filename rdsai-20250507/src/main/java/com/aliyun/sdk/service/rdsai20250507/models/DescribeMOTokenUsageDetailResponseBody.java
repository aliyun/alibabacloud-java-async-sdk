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

    private DescribeMOTokenUsageDetailResponseBody(Builder builder) {
        this.nextCursor = builder.nextCursor;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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

    public static final class Builder {
        private String nextCursor; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List<Records> records; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeMOTokenUsageDetailResponseBody model) {
            this.nextCursor = model.nextCursor;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.records = model.records;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * NextCursor.
         */
        public Builder nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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
        @com.aliyun.core.annotation.NameInMap("ConsumerName")
        private String consumerName;

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
            this.consumerName = builder.consumerName;
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
         * @return consumerName
         */
        public String getConsumerName() {
            return this.consumerName;
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
            private String consumerName; 
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
                this.consumerName = model.consumerName;
                this.inputTokens = model.inputTokens;
                this.instanceId = model.instanceId;
                this.model = model.model;
                this.outputTokens = model.outputTokens;
                this.region = model.region;
                this.requestTime = model.requestTime;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * ConsumerName.
             */
            public Builder consumerName(String consumerName) {
                this.consumerName = consumerName;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RequestTime.
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * TotalTokens.
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
