// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link EnsureSharedPrometheusInstanceRequest} extends {@link RequestModel}
 *
 * <p>EnsureSharedPrometheusInstanceRequest</p>
 */
public class EnsureSharedPrometheusInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private EnsureSharedPrometheusInstanceRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.shareScope = builder.shareScope;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnsureSharedPrometheusInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return shareScope
     */
    public String getShareScope() {
        return this.shareScope;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<EnsureSharedPrometheusInstanceRequest, Builder> {
        private String aliyunLang; 
        private String shareScope; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(EnsureSharedPrometheusInstanceRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.shareScope = request.shareScope;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The language of the returned information. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.
         * Default value: zh.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("aliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>The share scope. Currently, only Workspace is supported, which indicates the shared Prometheus instance for the workspace in the requested region. Workspaces in the same region share the same instance, and no additional instances are created. Policy and Environment are not currently supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Workspace</p>
         */
        public Builder shareScope(String shareScope) {
            this.putBodyParameter("shareScope", shareScope);
            this.shareScope = shareScope;
            return this;
        }

        /**
         * <p>The name of the workspace. If the workspace does not exist, a 404 error is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>team-workspace</p>
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public EnsureSharedPrometheusInstanceRequest build() {
            return new EnsureSharedPrometheusInstanceRequest(this);
        } 

    } 

}
