// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QueryModelUsageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryModelUsageInfoResponseBody</p>
 */
public class QueryModelUsageInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryModelUsageInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryModelUsageInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryModelUsageInfoResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The model usage summary for the selected business, statistical window, and model type. If no statistical results are available for <code>24h</code> or <code>1d</code> queries without specified start and end dates, each metric returns 0. If no statistical results are available for other windows or custom date ranges, no valid metric values are provided. In this case, do not treat the usage as zero.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ActiveModelCount&quot;:10,&quot;CallCount&quot;:13280,&quot;PointsConsumption&quot;:120}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which is used to locate and troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryModelUsageInfoResponseBody build() {
            return new QueryModelUsageInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryModelUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryModelUsageInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveModelCount")
        private Long activeModelCount;

        @com.aliyun.core.annotation.NameInMap("CallCount")
        private Long callCount;

        @com.aliyun.core.annotation.NameInMap("PointsConsumption")
        private Double pointsConsumption;

        private Data(Builder builder) {
            this.activeModelCount = builder.activeModelCount;
            this.callCount = builder.callCount;
            this.pointsConsumption = builder.pointsConsumption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeModelCount
         */
        public Long getActiveModelCount() {
            return this.activeModelCount;
        }

        /**
         * @return callCount
         */
        public Long getCallCount() {
            return this.callCount;
        }

        /**
         * @return pointsConsumption
         */
        public Double getPointsConsumption() {
            return this.pointsConsumption;
        }

        public static final class Builder {
            private Long activeModelCount; 
            private Long callCount; 
            private Double pointsConsumption; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeModelCount = model.activeModelCount;
                this.callCount = model.callCount;
                this.pointsConsumption = model.pointsConsumption;
            } 

            /**
             * <p>The number of distinct models that have been called at least once within the query range. Unit: models. The value is deduplicated by model code. It may not be equal to the <code>TotalCount</code> of the model usage list, which may also include models that have not been called within the current query range.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder activeModelCount(Long activeModelCount) {
                this.activeModelCount = activeModelCount;
                return this;
            }

            /**
             * <p>The total number of model calls within the query range. Unit: calls. This includes both successful and failed calls.</p>
             * 
             * <strong>example:</strong>
             * <p>13280</p>
             */
            public Builder callCount(Long callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * <p>The actual points consumed within the query range. Unit: points. The returned value can be displayed directly without further conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder pointsConsumption(Double pointsConsumption) {
                this.pointsConsumption = pointsConsumption;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
