// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateContactFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateContactFlowRequest</p>
 */
public class CreateContactFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Definition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String definition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateContactFlowRequest(Builder builder) {
        super(builder);
        this.definition = builder.definition;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContactFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateContactFlowRequest, Builder> {
        private String definition; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateContactFlowRequest request) {
            super(request);
            this.definition = request.definition;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN_FLOW</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateContactFlowRequest build() {
            return new CreateContactFlowRequest(this);
        } 

    } 

}
