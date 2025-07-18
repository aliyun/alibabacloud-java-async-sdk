// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasrasp20240727.models;

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
 * {@link DescribeAttackProtectionCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeAttackProtectionCountRequest</p>
 */
public class DescribeAttackProtectionCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer startTimestamp;

    private DescribeAttackProtectionCountRequest(Builder builder) {
        super(builder);
        this.agentType = builder.agentType;
        this.endTimestamp = builder.endTimestamp;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttackProtectionCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return endTimestamp
     */
    public Integer getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return startTimestamp
     */
    public Integer getStartTimestamp() {
        return this.startTimestamp;
    }

    public static final class Builder extends Request.Builder<DescribeAttackProtectionCountRequest, Builder> {
        private String agentType; 
        private Integer endTimestamp; 
        private Integer startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAttackProtectionCountRequest request) {
            super(request);
            this.agentType = request.agentType;
            this.endTimestamp = request.endTimestamp;
            this.startTimestamp = request.startTimestamp;
        } 

        /**
         * AgentType.
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1767456000000</p>
         */
        public Builder endTimestamp(Integer endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1739289981765</p>
         */
        public Builder startTimestamp(Integer startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        @Override
        public DescribeAttackProtectionCountRequest build() {
            return new DescribeAttackProtectionCountRequest(this);
        } 

    } 

}
