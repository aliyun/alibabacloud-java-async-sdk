// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetRuntimeModelConfigRequest} extends {@link RequestModel}
 *
 * <p>GetRuntimeModelConfigRequest</p>
 */
public class GetRuntimeModelConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    private String agentPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeRiskInfo")
    private Boolean includeRiskInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtimeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuntimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtimeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartModel")
    private Boolean smartModel;

    private GetRuntimeModelConfigRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.includeRiskInfo = builder.includeRiskInfo;
        this.runtimeId = builder.runtimeId;
        this.runtimeType = builder.runtimeType;
        this.smartModel = builder.smartModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuntimeModelConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentPlatform
     */
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return includeRiskInfo
     */
    public Boolean getIncludeRiskInfo() {
        return this.includeRiskInfo;
    }

    /**
     * @return runtimeId
     */
    public String getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * @return runtimeType
     */
    public String getRuntimeType() {
        return this.runtimeType;
    }

    /**
     * @return smartModel
     */
    public Boolean getSmartModel() {
        return this.smartModel;
    }

    public static final class Builder extends Request.Builder<GetRuntimeModelConfigRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private Boolean includeRiskInfo; 
        private String runtimeId; 
        private String runtimeType; 
        private Boolean smartModel; 

        private Builder() {
            super();
        } 

        private Builder(GetRuntimeModelConfigRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.includeRiskInfo = request.includeRiskInfo;
            this.runtimeId = request.runtimeId;
            this.runtimeType = request.runtimeType;
            this.smartModel = request.smartModel;
        } 

        /**
         * <p>The agent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putQueryParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>The agent provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putQueryParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>Specifies whether to include risk information.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeRiskInfo(Boolean includeRiskInfo) {
            this.putQueryParameter("IncludeRiskInfo", includeRiskInfo);
            this.includeRiskInfo = includeRiskInfo;
            return this;
        }

        /**
         * <p>The ID of the agent runtime. The ID mappings are as follows:</p>
         * <p>JVS Computer: JVS Computer ID, in the format of jvs-xxxx.</p>
         * <p>OpenClaw: Cloud desktop ID, in the format of ecd-xxxx.</p>
         * <p>Hermes Agent: Hermes Agent ID, in the format of jvs-xxxx.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xxxx</p>
         */
        public Builder runtimeId(String runtimeId) {
            this.putQueryParameter("RuntimeId", runtimeId);
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * <p>The type of the agent runtime.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        public Builder runtimeType(String runtimeType) {
            this.putQueryParameter("RuntimeType", runtimeType);
            this.runtimeType = runtimeType;
            return this;
        }

        /**
         * <p>The smart model filter. Valid values:</p>
         * <ul>
         * <li>true: Queries the system wuying-preset provider models based on the business type of the runtime.</li>
         * <li>false: Excludes wuying-preset from the effective configuration.</li>
         * <li>Empty: Returns both smart and non-smart models in the effective configuration.
         * The business type is read by the server from runtime.biz_type, and the BizType input parameter is not required. Risk information is still independently controlled by IncludeRiskInfo.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder smartModel(Boolean smartModel) {
            this.putQueryParameter("SmartModel", smartModel);
            this.smartModel = smartModel;
            return this;
        }

        @Override
        public GetRuntimeModelConfigRequest build() {
            return new GetRuntimeModelConfigRequest(this);
        } 

    } 

}
