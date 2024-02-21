// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
    @NameInMap("Duration")
    @Validation(required = true)
    private Integer duration;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("PricingCycle")
    @Validation(required = true)
    private String pricingCycle;

    @Body
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    private QueryRenewInstancePriceRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.pricingCycle = builder.pricingCycle;
        this.region = builder.region;
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

    public static final class Builder extends Request.Builder<QueryRenewInstancePriceRequest, Builder> {
        private Integer duration; 
        private String instanceId; 
        private String pricingCycle; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(QueryRenewInstancePriceRequest request) {
            super(request);
            this.duration = request.duration;
            this.instanceId = request.instanceId;
            this.pricingCycle = request.pricingCycle;
            this.region = request.region;
        } 

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public QueryRenewInstancePriceRequest build() {
            return new QueryRenewInstancePriceRequest(this);
        } 

    } 

}
