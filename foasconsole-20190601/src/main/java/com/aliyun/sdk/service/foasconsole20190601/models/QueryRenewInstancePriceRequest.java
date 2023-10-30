// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRenewInstancePriceRequest} extends {@link RequestModel}
 *
 * <p>QueryRenewInstancePriceRequest</p>
 */
public class QueryRenewInstancePriceRequest extends Request {
    @Body
    @NameInMap("RenewInstanceRequest")
    @Validation(required = true)
    private RenewInstanceRequest renewInstanceRequest;

    private QueryRenewInstancePriceRequest(Builder builder) {
        super(builder);
        this.renewInstanceRequest = builder.renewInstanceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRenewInstancePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return renewInstanceRequest
     */
    public RenewInstanceRequest getRenewInstanceRequest() {
        return this.renewInstanceRequest;
    }

    public static final class Builder extends Request.Builder<QueryRenewInstancePriceRequest, Builder> {
        private RenewInstanceRequest renewInstanceRequest; 

        private Builder() {
            super();
        } 

        private Builder(QueryRenewInstancePriceRequest request) {
            super(request);
            this.renewInstanceRequest = request.renewInstanceRequest;
        } 

        /**
         * RenewInstanceRequest.
         */
        public Builder renewInstanceRequest(RenewInstanceRequest renewInstanceRequest) {
            this.putBodyParameter("RenewInstanceRequest", renewInstanceRequest);
            this.renewInstanceRequest = renewInstanceRequest;
            return this;
        }

        @Override
        public QueryRenewInstancePriceRequest build() {
            return new QueryRenewInstancePriceRequest(this);
        } 

    } 

    public static class RenewInstanceRequest extends TeaModel {
        @NameInMap("Duration")
        @Validation(required = true)
        private Integer duration;

        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("PricingCycle")
        @Validation(required = true)
        private String pricingCycle;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        private RenewInstanceRequest(Builder builder) {
            this.duration = builder.duration;
            this.instanceId = builder.instanceId;
            this.pricingCycle = builder.pricingCycle;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenewInstanceRequest create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer duration; 
            private String instanceId; 
            private String pricingCycle; 
            private String region; 

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
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
             * PricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RenewInstanceRequest build() {
                return new RenewInstanceRequest(this);
            } 

        } 

    }
}
