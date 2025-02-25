// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunRankingModelTemplateRequest} extends {@link RequestModel}
 *
 * <p>RunRankingModelTemplateRequest</p>
 */
public class RunRankingModelTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private RunRankingModelTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunRankingModelTemplateRequest create() {
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<RunRankingModelTemplateRequest, Builder> {
        private String instanceId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(RunRankingModelTemplateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public RunRankingModelTemplateRequest build() {
            return new RunRankingModelTemplateRequest(this);
        } 

    } 

}
