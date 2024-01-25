// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryScaleUpPriceRequest} extends {@link RequestModel}
 *
 * <p>QueryScaleUpPriceRequest</p>
 */
public class QueryScaleUpPriceRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    @Validation(required = true)
    private String clusterBizId;

    @Query
    @NameInMap("CoreNumber")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Long coreNumber;

    @Query
    @NameInMap("Duration")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Long duration;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("NodeGroupType")
    private String nodeGroupType;

    @Query
    @NameInMap("PricingCycle")
    @Validation(required = true)
    private String pricingCycle;

    private QueryScaleUpPriceRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
        this.coreNumber = builder.coreNumber;
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.nodeGroupType = builder.nodeGroupType;
        this.pricingCycle = builder.pricingCycle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryScaleUpPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterBizId
     */
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    /**
     * @return coreNumber
     */
    public Long getCoreNumber() {
        return this.coreNumber;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return nodeGroupType
     */
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public static final class Builder extends Request.Builder<QueryScaleUpPriceRequest, Builder> {
        private String clusterBizId; 
        private Long coreNumber; 
        private Long duration; 
        private String instanceId; 
        private String instanceType; 
        private String nodeGroupType; 
        private String pricingCycle; 

        private Builder() {
            super();
        } 

        private Builder(QueryScaleUpPriceRequest request) {
            super(request);
            this.clusterBizId = request.clusterBizId;
            this.coreNumber = request.coreNumber;
            this.duration = request.duration;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.nodeGroupType = request.nodeGroupType;
            this.pricingCycle = request.pricingCycle;
        } 

        /**
         * ClusterBizId.
         */
        public Builder clusterBizId(String clusterBizId) {
            this.putQueryParameter("ClusterBizId", clusterBizId);
            this.clusterBizId = clusterBizId;
            return this;
        }

        /**
         * CoreNumber.
         */
        public Builder coreNumber(Long coreNumber) {
            this.putQueryParameter("CoreNumber", coreNumber);
            this.coreNumber = coreNumber;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * NodeGroupType.
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.putQueryParameter("NodeGroupType", nodeGroupType);
            this.nodeGroupType = nodeGroupType;
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

        @Override
        public QueryScaleUpPriceRequest build() {
            return new QueryScaleUpPriceRequest(this);
        } 

    } 

}
