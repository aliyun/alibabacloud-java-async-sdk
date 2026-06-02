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
 * {@link LaunchFlowRequest} extends {@link RequestModel}
 *
 * <p>LaunchFlowRequest</p>
 */
public class LaunchFlowRequest extends Request {
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
    private Integer flowVersion;

    private LaunchFlowRequest(Builder builder) {
        super(builder);
        this.flowDesc = builder.flowDesc;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
        this.flowTemplate = builder.flowTemplate;
        this.flowVersion = builder.flowVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaunchFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getFlowVersion() {
        return this.flowVersion;
    }

    public static final class Builder extends Request.Builder<LaunchFlowRequest, Builder> {
        private String flowDesc; 
        private String flowId; 
        private String flowName; 
        private String flowTemplate; 
        private Integer flowVersion; 

        private Builder() {
            super();
        } 

        private Builder(LaunchFlowRequest request) {
            super(request);
            this.flowDesc = request.flowDesc;
            this.flowId = request.flowId;
            this.flowName = request.flowName;
            this.flowTemplate = request.flowTemplate;
            this.flowVersion = request.flowVersion;
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
         * <p>flow-6a3acc07d51541b0b836</p>
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
        public Builder flowVersion(Integer flowVersion) {
            this.putQueryParameter("FlowVersion", flowVersion);
            this.flowVersion = flowVersion;
            return this;
        }

        @Override
        public LaunchFlowRequest build() {
            return new LaunchFlowRequest(this);
        } 

    } 

}
