// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeNotifyConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeNotifyConfigRequest</p>
 */
public class DescribeNotifyConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    private DescribeNotifyConfigRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNotifyConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentId
     */
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public static final class Builder extends Request.Builder<DescribeNotifyConfigRequest, Builder> {
        private String AIAgentId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNotifyConfigRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder AIAgentId(String AIAgentId) {
            this.putQueryParameter("AIAgentId", AIAgentId);
            this.AIAgentId = AIAgentId;
            return this;
        }

        @Override
        public DescribeNotifyConfigRequest build() {
            return new DescribeNotifyConfigRequest(this);
        } 

    } 

}
