// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopUaRequest} extends {@link RequestModel}
 *
 * <p>DescribeRuleHitsTopUaRequest</p>
 */
public class DescribeRuleHitsTopUaRequest extends Request {
    @Query
    @NameInMap("EndTimestamp")
    private String endTimestamp;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Resource")
    private String resource;

    @Query
    @NameInMap("StartTimestamp")
    @Validation(required = true)
    private String startTimestamp;

    private DescribeRuleHitsTopUaRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.instanceId = builder.instanceId;
        this.resource = builder.resource;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitsTopUaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return startTimestamp
     */
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    public static final class Builder extends Request.Builder<DescribeRuleHitsTopUaRequest, Builder> {
        private String endTimestamp; 
        private String instanceId; 
        private String resource; 
        private String startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRuleHitsTopUaRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.instanceId = request.instanceId;
            this.resource = request.resource;
            this.startTimestamp = request.startTimestamp;
        } 

        /**
         * EndTimestamp.
         */
        public Builder endTimestamp(String endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
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
         * Resource.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * StartTimestamp.
         */
        public Builder startTimestamp(String startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        @Override
        public DescribeRuleHitsTopUaRequest build() {
            return new DescribeRuleHitsTopUaRequest(this);
        } 

    } 

}
