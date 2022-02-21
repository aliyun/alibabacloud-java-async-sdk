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

    private DeleteDeprecatedTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
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

    public static final class Builder extends Request.Builder<DeleteDeprecatedTemplateRequest, Builder> {
        private String instanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeprecatedTemplateRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.name = response.name;
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

        @Override
        public DeleteDeprecatedTemplateRequest build() {
            return new DeleteDeprecatedTemplateRequest(this);
        } 

    } 

}
