// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetOptimizeTaskRequest} extends {@link RequestModel}
 *
 * <p>GetOptimizeTaskRequest</p>
 */
public class GetOptimizeTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("optimizeTaskName")
    private String optimizeTaskName;

    private GetOptimizeTaskRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.optimizeTaskName = builder.optimizeTaskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOptimizeTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return optimizeTaskName
     */
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    public static final class Builder extends Request.Builder<GetOptimizeTaskRequest, Builder> {
        private String agentSpace; 
        private String optimizeTaskName; 

        private Builder() {
            super();
        } 

        private Builder(GetOptimizeTaskRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.optimizeTaskName = request.optimizeTaskName;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * optimizeTaskName.
         */
        public Builder optimizeTaskName(String optimizeTaskName) {
            this.putPathParameter("optimizeTaskName", optimizeTaskName);
            this.optimizeTaskName = optimizeTaskName;
            return this;
        }

        @Override
        public GetOptimizeTaskRequest build() {
            return new GetOptimizeTaskRequest(this);
        } 

    } 

}
