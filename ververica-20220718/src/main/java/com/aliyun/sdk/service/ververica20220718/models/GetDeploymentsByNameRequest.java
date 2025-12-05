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
 * {@link GetDeploymentsByNameRequest} extends {@link RequestModel}
 *
 * <p>GetDeploymentsByNameRequest</p>
 */
public class GetDeploymentsByNameRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("deploymentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ignoreJobSummary")
    private Boolean ignoreJobSummary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ignoreResourceSetting")
    private Boolean ignoreResourceSetting;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetDeploymentsByNameRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.deploymentName = builder.deploymentName;
        this.ignoreJobSummary = builder.ignoreJobSummary;
        this.ignoreResourceSetting = builder.ignoreResourceSetting;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentsByNameRequest create() {
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
     * @return deploymentName
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * @return ignoreJobSummary
     */
    public Boolean getIgnoreJobSummary() {
        return this.ignoreJobSummary;
    }

    /**
     * @return ignoreResourceSetting
     */
    public Boolean getIgnoreResourceSetting() {
        return this.ignoreResourceSetting;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetDeploymentsByNameRequest, Builder> {
        private String namespace; 
        private String deploymentName; 
        private Boolean ignoreJobSummary; 
        private Boolean ignoreResourceSetting; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetDeploymentsByNameRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.deploymentName = request.deploymentName;
            this.ignoreJobSummary = request.ignoreJobSummary;
            this.ignoreResourceSetting = request.ignoreResourceSetting;
            this.workspace = request.workspace;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder deploymentName(String deploymentName) {
            this.putPathParameter("deploymentName", deploymentName);
            this.deploymentName = deploymentName;
            return this;
        }

        /**
         * ignoreJobSummary.
         */
        public Builder ignoreJobSummary(Boolean ignoreJobSummary) {
            this.putQueryParameter("ignoreJobSummary", ignoreJobSummary);
            this.ignoreJobSummary = ignoreJobSummary;
            return this;
        }

        /**
         * ignoreResourceSetting.
         */
        public Builder ignoreResourceSetting(Boolean ignoreResourceSetting) {
            this.putQueryParameter("ignoreResourceSetting", ignoreResourceSetting);
            this.ignoreResourceSetting = ignoreResourceSetting;
            return this;
        }

        /**
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
        public GetDeploymentsByNameRequest build() {
            return new GetDeploymentsByNameRequest(this);
        } 

    } 

}
