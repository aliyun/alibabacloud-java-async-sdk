// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ManageTerraformStateRequest} extends {@link RequestModel}
 *
 * <p>ManageTerraformStateRequest</p>
 */
public class ManageTerraformStateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("importResourceId")
    private String importResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ManageTerraformStateRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.clientToken = builder.clientToken;
        this.identifier = builder.identifier;
        this.importResourceId = builder.importResourceId;
        this.resourceIdentifier = builder.resourceIdentifier;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageTerraformStateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return importResourceId
     */
    public String getImportResourceId() {
        return this.importResourceId;
    }

    /**
     * @return resourceIdentifier
     */
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ManageTerraformStateRequest, Builder> {
        private String action; 
        private String clientToken; 
        private String identifier; 
        private String importResourceId; 
        private String resourceIdentifier; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ManageTerraformStateRequest request) {
            super(request);
            this.action = request.action;
            this.clientToken = request.clientToken;
            this.identifier = request.identifier;
            this.importResourceId = request.importResourceId;
            this.resourceIdentifier = request.resourceIdentifier;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Import</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-as11xxxxxxxxx:developmentA</p>
         */
        public Builder identifier(String identifier) {
            this.putBodyParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * importResourceId.
         */
        public Builder importResourceId(String importResourceId) {
            this.putBodyParameter("importResourceId", importResourceId);
            this.importResourceId = importResourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc:alicloud_vswitch.vswitches[0]</p>
         */
        public Builder resourceIdentifier(String resourceIdentifier) {
            this.putBodyParameter("resourceIdentifier", resourceIdentifier);
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Stack</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ManageTerraformStateRequest build() {
            return new ManageTerraformStateRequest(this);
        } 

    } 

}
