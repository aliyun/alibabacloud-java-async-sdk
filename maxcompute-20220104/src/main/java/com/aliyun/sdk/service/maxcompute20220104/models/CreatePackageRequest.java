// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreatePackageRequest} extends {@link RequestModel}
 *
 * <p>CreatePackageRequest</p>
 */
public class CreatePackageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isInstall")
    private Boolean isInstall;

    private CreatePackageRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.body = builder.body;
        this.isInstall = builder.isInstall;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return isInstall
     */
    public Boolean getIsInstall() {
        return this.isInstall;
    }

    public static final class Builder extends Request.Builder<CreatePackageRequest, Builder> {
        private String projectName; 
        private String body; 
        private Boolean isInstall; 

        private Builder() {
            super();
        } 

        private Builder(CreatePackageRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.body = request.body;
            this.isInstall = request.isInstall;
        } 

        /**
         * <p>The name of the MaxCompute project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>projectA</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request body parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;name&quot;: &quot;test_packege&quot;, 
         *     &quot;resourceList&quot;: { 
         *         &quot;table&quot;: [
         *             {
         *                 &quot;name&quot;: &quot;table_name&quot;,
         *                 &quot;actions&quot;: [
         *                     &quot;Describe&quot;,
         *                     &quot;Select&quot;
         *                 ]
         *             },
         *             {
         *                 &quot;name&quot;: &quot;table_name&quot;,
         *                 &quot;actions&quot;: [
         *                     &quot;Describe&quot;,
         *                     &quot;Select&quot;
         *                 ]
         *             }
         *         ],
         *         &quot;resource&quot;: [
         *             {
         *                 &quot;name&quot;: &quot;&quot;,
         *                 &quot;actions&quot;: []
         *             },
         *             {
         *                 &quot;name&quot;: &quot;&quot;,
         *                 &quot;actions&quot;: []
         *             }
         *         ],
         *         &quot;function&quot;: [
         *             {
         *                 &quot;name&quot;: &quot;&quot;,
         *                 &quot;actions&quot;: []
         *             },
         *             {
         *                 &quot;name&quot;: &quot;&quot;,
         *                 &quot;actions&quot;: []
         *             }
         *         ]
         *     }
         * }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>Specifies whether to install the package.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isInstall(Boolean isInstall) {
            this.putQueryParameter("isInstall", isInstall);
            this.isInstall = isInstall;
            return this;
        }

        @Override
        public CreatePackageRequest build() {
            return new CreatePackageRequest(this);
        } 

    } 

}
