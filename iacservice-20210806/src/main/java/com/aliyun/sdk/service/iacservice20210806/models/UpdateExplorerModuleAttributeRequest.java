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
 * {@link UpdateExplorerModuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateExplorerModuleAttributeRequest</p>
 */
public class UpdateExplorerModuleAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("explorerModuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String explorerModuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private UpdateExplorerModuleAttributeRequest(Builder builder) {
        super(builder);
        this.explorerModuleId = builder.explorerModuleId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExplorerModuleAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explorerModuleId
     */
    public String getExplorerModuleId() {
        return this.explorerModuleId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateExplorerModuleAttributeRequest, Builder> {
        private String explorerModuleId; 
        private String clientToken; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExplorerModuleAttributeRequest request) {
            super(request);
            this.explorerModuleId = request.explorerModuleId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-al1611jl2tce3nlh2uvklh0</p>
         */
        public Builder explorerModuleId(String explorerModuleId) {
            this.putPathParameter("explorerModuleId", explorerModuleId);
            this.explorerModuleId = explorerModuleId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateExplorerModuleAttributeRequest build() {
            return new UpdateExplorerModuleAttributeRequest(this);
        } 

    } 

}
