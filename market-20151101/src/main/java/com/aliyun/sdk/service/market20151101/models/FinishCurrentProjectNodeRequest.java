// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FinishCurrentProjectNodeRequest} extends {@link RequestModel}
 *
 * <p>FinishCurrentProjectNodeRequest</p>
 */
public class FinishCurrentProjectNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateForm")
    private String templateForm;

    private FinishCurrentProjectNodeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.remark = builder.remark;
        this.templateForm = builder.templateForm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinishCurrentProjectNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return templateForm
     */
    public String getTemplateForm() {
        return this.templateForm;
    }

    public static final class Builder extends Request.Builder<FinishCurrentProjectNodeRequest, Builder> {
        private String instanceId; 
        private Long nodeId; 
        private String remark; 
        private String templateForm; 

        private Builder() {
            super();
        } 

        private Builder(FinishCurrentProjectNodeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.remark = request.remark;
            this.templateForm = request.templateForm;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4****89</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1924</p>
         */
        public Builder nodeId(Long nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * TemplateForm.
         */
        public Builder templateForm(String templateForm) {
            this.putQueryParameter("TemplateForm", templateForm);
            this.templateForm = templateForm;
            return this;
        }

        @Override
        public FinishCurrentProjectNodeRequest build() {
            return new FinishCurrentProjectNodeRequest(this);
        } 

    } 

}
