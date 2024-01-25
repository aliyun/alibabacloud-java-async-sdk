// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPriceRequest} extends {@link RequestModel}
 *
 * <p>QueryPriceRequest</p>
 */
public class QueryPriceRequest extends Request {
    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NodeGroupSpecs")
    private String nodeGroupSpecs;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private QueryPriceRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.nodeGroupSpecs = builder.nodeGroupSpecs;
        this.pricingCycle = builder.pricingCycle;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPriceRequest create() {
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
     * @return nodeGroupSpecs
     */
    public String getNodeGroupSpecs() {
        return this.nodeGroupSpecs;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<QueryPriceRequest, Builder> {
        private Integer duration; 
        private String instanceId; 
        private String nodeGroupSpecs; 
        private String pricingCycle; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPriceRequest request) {
            super(request);
            this.duration = request.duration;
            this.instanceId = request.instanceId;
            this.nodeGroupSpecs = request.nodeGroupSpecs;
            this.pricingCycle = request.pricingCycle;
            this.regionId = request.regionId;
        } 

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeGroupSpecs.
         */
        public Builder nodeGroupSpecs(String nodeGroupSpecs) {
            this.putQueryParameter("NodeGroupSpecs", nodeGroupSpecs);
            this.nodeGroupSpecs = nodeGroupSpecs;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public QueryPriceRequest build() {
            return new QueryPriceRequest(this);
        } 

    } 

}
