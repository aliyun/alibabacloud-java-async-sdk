// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyRankingModelTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyRankingModelTemplateRequest</p>
 */
public class ModifyRankingModelTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map < String, ? > body;

    private ModifyRankingModelTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.templateId = builder.templateId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRankingModelTemplateRequest create() {
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

    /**
     * @return body
     */
    public java.util.Map < String, ? > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModifyRankingModelTemplateRequest, Builder> {
        private String instanceId; 
        private String templateId; 
        private java.util.Map < String, ? > body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRankingModelTemplateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.templateId = request.templateId;
            this.body = request.body;
        } 

        /**
         * <p>The instance ID.</p>
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
         * <p>The ID of the ranking model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a-a-a</p>
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder body(java.util.Map < String, ? > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModifyRankingModelTemplateRequest build() {
            return new ModifyRankingModelTemplateRequest(this);
        } 

    } 

}
