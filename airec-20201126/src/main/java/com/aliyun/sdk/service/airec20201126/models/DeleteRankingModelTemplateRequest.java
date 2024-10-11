// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRankingModelTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteRankingModelTemplateRequest</p>
 */
public class DeleteRankingModelTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("templateId")
    private String templateId;

    private DeleteRankingModelTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRankingModelTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteRankingModelTemplateRequest, Builder> {
        private String instanceId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRankingModelTemplateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.templateId = request.templateId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * templateId.
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DeleteRankingModelTemplateRequest build() {
            return new DeleteRankingModelTemplateRequest(this);
        } 

    } 

}
