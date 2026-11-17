// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateModelGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateModelGroupRequest</p>
 */
public class CreateModelGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCardIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> modelCardIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateModelGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.gatewayId = builder.gatewayId;
        this.modelCardIds = builder.modelCardIds;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return modelCardIds
     */
    public java.util.List<String> getModelCardIds() {
        return this.modelCardIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateModelGroupRequest, Builder> {
        private String description; 
        private String gatewayId; 
        private java.util.List<String> modelCardIds; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelGroupRequest request) {
            super(request);
            this.description = request.description;
            this.gatewayId = request.gatewayId;
            this.modelCardIds = request.modelCardIds;
            this.name = request.name;
        } 

        /**
         * <p>The description of the model group. The description can be up to 1,024 UTF-16 code units in length and can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Model group for service integration</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the AI gateway instance to which the resource belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d00000000000000000000</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The IDs of the actual or logical model cards within the same instance. The list can be empty and must not contain duplicate values. Model groups are not accepted as members.</p>
         * <p>This parameter is required.</p>
         */
        public Builder modelCardIds(java.util.List<String> modelCardIds) {
            this.putBodyParameter("modelCardIds", modelCardIds);
            this.modelCardIds = modelCardIds;
            return this;
        }

        /**
         * <p>The unique name within the instance. The name must be 1 to 128 UTF-8 bytes in length after trimming.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>beta-model-group</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateModelGroupRequest build() {
            return new CreateModelGroupRequest(this);
        } 

    } 

}
