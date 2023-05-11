// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiDatasourceParametersRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiDatasourceParametersRequest</p>
 */
public class ModifyApiDatasourceParametersRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("Parameters")
    @Validation(required = true)
    private String parameters;

    @Query
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private ModifyApiDatasourceParametersRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.parameters = builder.parameters;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiDatasourceParametersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ModifyApiDatasourceParametersRequest, Builder> {
        private String apiId; 
        private String parameters; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApiDatasourceParametersRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.parameters = request.parameters;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ModifyApiDatasourceParametersRequest build() {
            return new ModifyApiDatasourceParametersRequest(this);
        } 

    } 

}
