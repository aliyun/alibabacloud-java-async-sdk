// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link HighCodeDeployRequest} extends {@link RequestModel}
 *
 * <p>HighCodeDeployRequest</p>
 */
public class HighCodeDeployRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentDesc")
    private String agentDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentName")
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceCodeName")
    private String sourceCodeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceCodeOssUrl")
    private String sourceCodeOssUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("telemetryEnabled")
    private Boolean telemetryEnabled;

    private HighCodeDeployRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentDesc = builder.agentDesc;
        this.agentId = builder.agentId;
        this.agentName = builder.agentName;
        this.sourceCodeName = builder.sourceCodeName;
        this.sourceCodeOssUrl = builder.sourceCodeOssUrl;
        this.telemetryEnabled = builder.telemetryEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HighCodeDeployRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return agentDesc
     */
    public String getAgentDesc() {
        return this.agentDesc;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return sourceCodeName
     */
    public String getSourceCodeName() {
        return this.sourceCodeName;
    }

    /**
     * @return sourceCodeOssUrl
     */
    public String getSourceCodeOssUrl() {
        return this.sourceCodeOssUrl;
    }

    /**
     * @return telemetryEnabled
     */
    public Boolean getTelemetryEnabled() {
        return this.telemetryEnabled;
    }

    public static final class Builder extends Request.Builder<HighCodeDeployRequest, Builder> {
        private String workspaceId; 
        private String agentDesc; 
        private String agentId; 
        private String agentName; 
        private String sourceCodeName; 
        private String sourceCodeOssUrl; 
        private Boolean telemetryEnabled; 

        private Builder() {
            super();
        } 

        private Builder(HighCodeDeployRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentDesc = request.agentDesc;
            this.agentId = request.agentId;
            this.agentName = request.agentName;
            this.sourceCodeName = request.sourceCodeName;
            this.sourceCodeOssUrl = request.sourceCodeOssUrl;
            this.telemetryEnabled = request.telemetryEnabled;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * agentDesc.
         */
        public Builder agentDesc(String agentDesc) {
            this.putBodyParameter("agentDesc", agentDesc);
            this.agentDesc = agentDesc;
            return this;
        }

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * agentName.
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("agentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * sourceCodeName.
         */
        public Builder sourceCodeName(String sourceCodeName) {
            this.putBodyParameter("sourceCodeName", sourceCodeName);
            this.sourceCodeName = sourceCodeName;
            return this;
        }

        /**
         * sourceCodeOssUrl.
         */
        public Builder sourceCodeOssUrl(String sourceCodeOssUrl) {
            this.putBodyParameter("sourceCodeOssUrl", sourceCodeOssUrl);
            this.sourceCodeOssUrl = sourceCodeOssUrl;
            return this;
        }

        /**
         * telemetryEnabled.
         */
        public Builder telemetryEnabled(Boolean telemetryEnabled) {
            this.putBodyParameter("telemetryEnabled", telemetryEnabled);
            this.telemetryEnabled = telemetryEnabled;
            return this;
        }

        @Override
        public HighCodeDeployRequest build() {
            return new HighCodeDeployRequest(this);
        } 

    } 

}
