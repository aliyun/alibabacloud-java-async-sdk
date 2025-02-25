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
 * {@link UpdateUdfArtifactRequest} extends {@link RequestModel}
 *
 * <p>UpdateUdfArtifactRequest</p>
 */
public class UpdateUdfArtifactRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("udfArtifactName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String udfArtifactName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UdfArtifact body;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private UpdateUdfArtifactRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.udfArtifactName = builder.udfArtifactName;
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUdfArtifactRequest create() {
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
     * @return body
     */
    public UdfArtifact getBody() {
        return this.body;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UpdateUdfArtifactRequest, Builder> {
        private String namespace; 
        private String udfArtifactName; 
        private UdfArtifact body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUdfArtifactRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.udfArtifactName = request.udfArtifactName;
            this.body = request.body;
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
         * <p>The name of the JAR file of the UDF.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-udf</p>
         */
        public Builder udfArtifactName(String udfArtifactName) {
            this.putPathParameter("udfArtifactName", udfArtifactName);
            this.udfArtifactName = udfArtifactName;
            return this;
        }

        /**
         * <p>The details of the JAR file of the UDF.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UdfArtifact body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public UpdateUdfArtifactRequest build() {
            return new UpdateUdfArtifactRequest(this);
        } 

    } 

}
