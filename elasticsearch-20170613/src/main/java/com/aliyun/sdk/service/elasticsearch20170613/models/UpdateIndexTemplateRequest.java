// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIndexTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateIndexTemplateRequest</p>
 */
public class UpdateIndexTemplateRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("IndexTemplate")
    @Validation(required = true)
    private String indexTemplate;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private UpdateIndexTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexTemplate = builder.indexTemplate;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIndexTemplateRequest create() {
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

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateIndexTemplateRequest, Builder> {
        private String instanceId; 
        private String indexTemplate; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIndexTemplateRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.indexTemplate = response.indexTemplate;
            this.clientToken = response.clientToken;
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

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateIndexTemplateRequest build() {
            return new UpdateIndexTemplateRequest(this);
        } 

    } 

}
