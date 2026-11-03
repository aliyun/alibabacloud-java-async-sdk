// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdateTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateRequest</p>
 */
public class UpdateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private UpdateTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.templateName = builder.templateName;
        this.clientToken = builder.clientToken;
        this.body = builder.body;
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

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateTemplateRequest, Builder> {
        private String instanceId; 
        private String templateName; 
        private String clientToken; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.templateName = request.templateName;
            this.clientToken = request.clientToken;
            this.body = request.body;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The template name. Valid values:</p>
         * <ul>
         * <li>dynamicSettings: Dynamic cluster configuration.</li>
         * <li>indexTemplate: Index template configuration.</li>
         * <li>ilmPolicy: Index lifecycle configuration.</li>
         * <li>staticSettings: Static cluster configuration.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dynamicSettings</p>
         */
        public Builder templateName(String templateName) {
            this.putPathParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain a maximum of 64 ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies the template configuration content. For more information, see the RequestBody section.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;content&quot;: &quot;{\n\t\&quot;persistent\&quot;:{\n\t\t\&quot;search\&quot;:{\n\t\t\t\&quot;max_buckets\&quot;:\&quot;10000\&quot;\n\t\t}\n\t}\n}&quot; }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateTemplateRequest build() {
            return new UpdateTemplateRequest(this);
        } 

    } 

}
