// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetAgentRuntimeRequest} extends {@link RequestModel}
 *
 * <p>GetAgentRuntimeRequest</p>
 */
public class GetAgentRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRuntimeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentRuntimeVersion")
    private String agentRuntimeVersion;

    private GetAgentRuntimeRequest(Builder builder) {
        super(builder);
        this.agentRuntimeId = builder.agentRuntimeId;
        this.agentRuntimeVersion = builder.agentRuntimeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentRuntimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    /**
     * @return agentRuntimeVersion
     */
    public String getAgentRuntimeVersion() {
        return this.agentRuntimeVersion;
    }

    public static final class Builder extends Request.Builder<GetAgentRuntimeRequest, Builder> {
        private String agentRuntimeId; 
        private String agentRuntimeVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentRuntimeRequest request) {
            super(request);
            this.agentRuntimeId = request.agentRuntimeId;
            this.agentRuntimeVersion = request.agentRuntimeVersion;
        } 

        /**
         * <p>要获取详情的智能体运行时实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.putPathParameter("agentRuntimeId", agentRuntimeId);
            this.agentRuntimeId = agentRuntimeId;
            return this;
        }

        /**
         * <p>指定要获取的智能体运行时版本，如果不指定则返回最新版本</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        public Builder agentRuntimeVersion(String agentRuntimeVersion) {
            this.putQueryParameter("agentRuntimeVersion", agentRuntimeVersion);
            this.agentRuntimeVersion = agentRuntimeVersion;
            return this;
        }

        @Override
        public GetAgentRuntimeRequest build() {
            return new GetAgentRuntimeRequest(this);
        } 

    } 

}
