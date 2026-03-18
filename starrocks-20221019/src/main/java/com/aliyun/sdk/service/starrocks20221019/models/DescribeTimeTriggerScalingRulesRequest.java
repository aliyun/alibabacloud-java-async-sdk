// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeTimeTriggerScalingRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTimeTriggerScalingRulesRequest</p>
 */
public class DescribeTimeTriggerScalingRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    private DescribeTimeTriggerScalingRulesRequest(Builder builder) {
        super(builder);
        this.requestId = builder.requestId;
        this.regionId = builder.regionId;
        this.nodeGroupId = builder.nodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTimeTriggerScalingRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeTimeTriggerScalingRulesRequest, Builder> {
        private String requestId; 
        private String regionId; 
        private String nodeGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTimeTriggerScalingRulesRequest request) {
            super(request);
            this.requestId = request.requestId;
            this.regionId = request.regionId;
            this.nodeGroupId = request.nodeGroupId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putHostParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        @Override
        public DescribeTimeTriggerScalingRulesRequest build() {
            return new DescribeTimeTriggerScalingRulesRequest(this);
        } 

    } 

}
