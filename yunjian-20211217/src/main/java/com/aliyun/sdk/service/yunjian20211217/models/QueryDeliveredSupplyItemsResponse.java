// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link QueryDeliveredSupplyItemsResponse} extends {@link TeaModel}
 *
 * <p>QueryDeliveredSupplyItemsResponse</p>
 */
public class QueryDeliveredSupplyItemsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<QueryDeliveredSupplyItemsResponseBody> body;

    private QueryDeliveredSupplyItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryDeliveredSupplyItemsResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<QueryDeliveredSupplyItemsResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeliveredSupplyItemsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<QueryDeliveredSupplyItemsResponseBody> body);

        @Override
        QueryDeliveredSupplyItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeliveredSupplyItemsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<QueryDeliveredSupplyItemsResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeliveredSupplyItemsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<QueryDeliveredSupplyItemsResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeliveredSupplyItemsResponse build() {
            return new QueryDeliveredSupplyItemsResponse(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeliveredSupplyItemsResponse} extends {@link TeaModel}
     *
     * <p>QueryDeliveredSupplyItemsResponse</p>
     */
    public static class QueryDeliveredSupplyItemsResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("commodityTypeCode")
        private String commodityTypeCode;

        @com.aliyun.core.annotation.NameInMap("demandPlanId")
        private Long demandPlanId;

        @com.aliyun.core.annotation.NameInMap("planTitle")
        private String planTitle;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("zone")
        private String zone;

        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("demandCount")
        private Integer demandCount;

        @com.aliyun.core.annotation.NameInMap("deliveredAmount")
        private Integer deliveredAmount;

        @com.aliyun.core.annotation.NameInMap("openCount")
        private Integer openCount;

        private QueryDeliveredSupplyItemsResponseBody(Builder builder) {
            this.accountId = builder.accountId;
            this.commodityTypeCode = builder.commodityTypeCode;
            this.demandPlanId = builder.demandPlanId;
            this.planTitle = builder.planTitle;
            this.region = builder.region;
            this.zone = builder.zone;
            this.commodityCode = builder.commodityCode;
            this.demandCount = builder.demandCount;
            this.deliveredAmount = builder.deliveredAmount;
            this.openCount = builder.openCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryDeliveredSupplyItemsResponseBody create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return commodityTypeCode
         */
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        /**
         * @return demandPlanId
         */
        public Long getDemandPlanId() {
            return this.demandPlanId;
        }

        /**
         * @return planTitle
         */
        public String getPlanTitle() {
            return this.planTitle;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return demandCount
         */
        public Integer getDemandCount() {
            return this.demandCount;
        }

        /**
         * @return deliveredAmount
         */
        public Integer getDeliveredAmount() {
            return this.deliveredAmount;
        }

        /**
         * @return openCount
         */
        public Integer getOpenCount() {
            return this.openCount;
        }

        public static final class Builder {
            private String accountId; 
            private String commodityTypeCode; 
            private Long demandPlanId; 
            private String planTitle; 
            private String region; 
            private String zone; 
            private String commodityCode; 
            private Integer demandCount; 
            private Integer deliveredAmount; 
            private Integer openCount; 

            private Builder() {
            } 

            private Builder(QueryDeliveredSupplyItemsResponseBody model) {
                this.accountId = model.accountId;
                this.commodityTypeCode = model.commodityTypeCode;
                this.demandPlanId = model.demandPlanId;
                this.planTitle = model.planTitle;
                this.region = model.region;
                this.zone = model.zone;
                this.commodityCode = model.commodityCode;
                this.demandCount = model.demandCount;
                this.deliveredAmount = model.deliveredAmount;
                this.openCount = model.openCount;
            } 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * commodityTypeCode.
             */
            public Builder commodityTypeCode(String commodityTypeCode) {
                this.commodityTypeCode = commodityTypeCode;
                return this;
            }

            /**
             * demandPlanId.
             */
            public Builder demandPlanId(Long demandPlanId) {
                this.demandPlanId = demandPlanId;
                return this;
            }

            /**
             * planTitle.
             */
            public Builder planTitle(String planTitle) {
                this.planTitle = planTitle;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * demandCount.
             */
            public Builder demandCount(Integer demandCount) {
                this.demandCount = demandCount;
                return this;
            }

            /**
             * deliveredAmount.
             */
            public Builder deliveredAmount(Integer deliveredAmount) {
                this.deliveredAmount = deliveredAmount;
                return this;
            }

            /**
             * openCount.
             */
            public Builder openCount(Integer openCount) {
                this.openCount = openCount;
                return this;
            }

            public QueryDeliveredSupplyItemsResponseBody build() {
                return new QueryDeliveredSupplyItemsResponseBody(this);
            } 

        } 

    }
}
