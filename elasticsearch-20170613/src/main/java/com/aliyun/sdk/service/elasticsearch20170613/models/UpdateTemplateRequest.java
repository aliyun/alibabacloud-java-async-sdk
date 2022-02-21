// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateRequest</p>
 */
public class UpdateTemplateRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private UpdateTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.templateName = builder.templateName;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateRequest create() {
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
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateTemplateRequest, Builder> {
        private String instanceId; 
        private String templateName; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.templateName = response.templateName;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putPathParameter("TemplateName", templateName);
            this.templateName = templateName;
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
        public UpdateTemplateRequest build() {
            return new UpdateTemplateRequest(this);
        } 

    } 

}
