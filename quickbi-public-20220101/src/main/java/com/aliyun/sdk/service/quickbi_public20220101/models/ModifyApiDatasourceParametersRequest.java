// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ModifyApiDatasourceParametersRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiDatasourceParametersRequest</p>
 */
public class ModifyApiDatasourceParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the API data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b66a66de51f24d149116c17718138194</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The configuration of API data parameters in the JSONArray format. You can modify a maximum of 10 parameters.</p>
         * <ul>
         * <li>name: the name of a common parameter or a parameter in a query statement</li>
         * <li>value: the value of a common parameter or a parameter in a query statement.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;token&quot;,&quot;value&quot;:&quot;xxxxxxxxxxxx&quot;},{&quot;name&quot;:&quot;pageSize&quot;,&quot;value&quot;:100}]</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>726bee5a-****-43e1-9a8e-b550f0120f35</p>
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
