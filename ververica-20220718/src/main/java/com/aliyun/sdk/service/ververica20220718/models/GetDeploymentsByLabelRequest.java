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
 * {@link GetDeploymentsByLabelRequest} extends {@link RequestModel}
 *
 * <p>GetDeploymentsByLabelRequest</p>
 */
public class GetDeploymentsByLabelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ignoreJobSummary")
    private Boolean ignoreJobSummary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ignoreResourceSetting")
    private Boolean ignoreResourceSetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labelKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labelKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labelValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labelValue;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetDeploymentsByLabelRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.ignoreJobSummary = builder.ignoreJobSummary;
        this.ignoreResourceSetting = builder.ignoreResourceSetting;
        this.labelKey = builder.labelKey;
        this.labelValue = builder.labelValue;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentsByLabelRequest create() {
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
     * @return labelKey
     */
    public String getLabelKey() {
        return this.labelKey;
    }

    /**
     * @return labelValue
     */
    public String getLabelValue() {
        return this.labelValue;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetDeploymentsByLabelRequest, Builder> {
        private String namespace; 
        private Boolean ignoreJobSummary; 
        private Boolean ignoreResourceSetting; 
        private String labelKey; 
        private String labelValue; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetDeploymentsByLabelRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.ignoreJobSummary = request.ignoreJobSummary;
            this.ignoreResourceSetting = request.ignoreResourceSetting;
            this.labelKey = request.labelKey;
            this.labelValue = request.labelValue;
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
         * <p>key</p>
         */
        public Builder labelKey(String labelKey) {
            this.putQueryParameter("labelKey", labelKey);
            this.labelKey = labelKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        public Builder labelValue(String labelValue) {
            this.putQueryParameter("labelValue", labelValue);
            this.labelValue = labelValue;
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
        public GetDeploymentsByLabelRequest build() {
            return new GetDeploymentsByLabelRequest(this);
        } 

    } 

}
