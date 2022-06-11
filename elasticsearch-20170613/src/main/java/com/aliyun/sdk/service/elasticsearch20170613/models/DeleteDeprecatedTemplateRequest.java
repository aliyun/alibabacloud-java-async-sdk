// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeprecatedTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeprecatedTemplateRequest</p>
 */
public class DeleteDeprecatedTemplateRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    private String instanceId;

    @Path
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("body")
    private String body;

    private DeleteDeprecatedTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeprecatedTemplateRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DeleteDeprecatedTemplateRequest, Builder> {
        private String instanceId; 
        private String name; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeprecatedTemplateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.body = request.body;
        } 

        /**
         * A short description of struct
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DeleteDeprecatedTemplateRequest build() {
            return new DeleteDeprecatedTemplateRequest(this);
        } 

    } 

}
