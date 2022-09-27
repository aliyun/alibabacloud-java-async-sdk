// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIndexTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteIndexTemplateRequest</p>
 */
public class DeleteIndexTemplateRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("IndexTemplate")
    @Validation(required = true)
    private String indexTemplate;

    private DeleteIndexTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexTemplate = builder.indexTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndexTemplateRequest create() {
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
     * @return indexTemplate
     */
    public String getIndexTemplate() {
        return this.indexTemplate;
    }

    public static final class Builder extends Request.Builder<DeleteIndexTemplateRequest, Builder> {
        private String instanceId; 
        private String indexTemplate; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIndexTemplateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.indexTemplate = request.indexTemplate;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IndexTemplate.
         */
        public Builder indexTemplate(String indexTemplate) {
            this.putPathParameter("IndexTemplate", indexTemplate);
            this.indexTemplate = indexTemplate;
            return this;
        }

        @Override
        public DeleteIndexTemplateRequest build() {
            return new DeleteIndexTemplateRequest(this);
        } 

    } 

}
