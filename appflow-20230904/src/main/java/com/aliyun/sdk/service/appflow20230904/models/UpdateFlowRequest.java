// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
 * {@link UpdateFlowRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowRequest</p>
 */
public class UpdateFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowDesc")
    private String flowDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowName")
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowTemplate")
    private String flowTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowVersion")
    private String flowVersion;

    private UpdateFlowRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.flowDesc = builder.flowDesc;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
        this.flowTemplate = builder.flowTemplate;
        this.flowVersion = builder.flowVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return flowDesc
     */
    public String getFlowDesc() {
        return this.flowDesc;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return flowTemplate
     */
    public String getFlowTemplate() {
        return this.flowTemplate;
    }

    /**
     * @return flowVersion
     */
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public static final class Builder extends Request.Builder<UpdateFlowRequest, Builder> {
        private Boolean enabled; 
        private String flowDesc; 
        private String flowId; 
        private String flowName; 
        private String flowTemplate; 
        private String flowVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowRequest request) {
            super(request);
            this.enabled = request.enabled;
            this.flowDesc = request.flowDesc;
            this.flowId = request.flowId;
            this.flowName = request.flowName;
            this.flowTemplate = request.flowTemplate;
            this.flowVersion = request.flowVersion;
        } 

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * FlowDesc.
         */
        public Builder flowDesc(String flowDesc) {
            this.putQueryParameter("FlowDesc", flowDesc);
            this.flowDesc = flowDesc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-15550241a1e942c29835</p>
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * FlowTemplate.
         */
        public Builder flowTemplate(String flowTemplate) {
            this.putQueryParameter("FlowTemplate", flowTemplate);
            this.flowTemplate = flowTemplate;
            return this;
        }

        /**
         * FlowVersion.
         */
        public Builder flowVersion(String flowVersion) {
            this.putQueryParameter("FlowVersion", flowVersion);
            this.flowVersion = flowVersion;
            return this;
        }

        @Override
        public UpdateFlowRequest build() {
            return new UpdateFlowRequest(this);
        } 

    } 

}
