// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link GetUdfArtifactsRequest} extends {@link RequestModel}
 *
 * <p>GetUdfArtifactsRequest</p>
 */
public class GetUdfArtifactsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("udfArtifactName")
    private String udfArtifactName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetUdfArtifactsRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.udfArtifactName = builder.udfArtifactName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUdfArtifactsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return udfArtifactName
     */
    public String getUdfArtifactName() {
        return this.udfArtifactName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetUdfArtifactsRequest, Builder> {
        private String namespace; 
        private String udfArtifactName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetUdfArtifactsRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.udfArtifactName = request.udfArtifactName;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The name of the JAR or Python file that corresponds to the UDF.</p>
         * 
         * <strong>example:</strong>
         * <p>test-udf</p>
         */
        public Builder udfArtifactName(String udfArtifactName) {
            this.putQueryParameter("udfArtifactName", udfArtifactName);
            this.udfArtifactName = udfArtifactName;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>710d6a64d8c34d</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetUdfArtifactsRequest build() {
            return new GetUdfArtifactsRequest(this);
        } 

    } 

}
