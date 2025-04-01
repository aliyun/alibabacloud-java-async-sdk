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
 * {@link UpdatePackageRequest} extends {@link RequestModel}
 *
 * <p>UpdatePackageRequest</p>
 */
public class UpdatePackageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("packageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private UpdatePackageRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.packageName = builder.packageName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePackageRequest create() {
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
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdatePackageRequest, Builder> {
        private String projectName; 
        private String packageName; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePackageRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.packageName = request.packageName;
            this.body = request.body;
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
         * <p>The name of the package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>packageA</p>
         */
        public Builder packageName(String packageName) {
            this.putPathParameter("packageName", packageName);
            this.packageName = packageName;
            return this;
        }

        /**
         * <p>The request body parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;add&quot;: {
         *         &quot;allowedProjectList&quot;: [
         *             {
         *                 &quot;label&quot;: &quot;2&quot;,
         *                 &quot;project&quot;: &quot;project_name&quot;
         *             }
         *         ],
         *         &quot;resourceList&quot;: {
         *             &quot;table&quot;: [
         *                 {
         *                     &quot;name&quot;: &quot;table_name&quot;,
         *                     &quot;actions&quot;: [
         *                         &quot;Describe&quot;,
         *                         &quot;Select&quot;
         *                     ]
         *                 },
         *                 {
         *                     &quot;name&quot;: &quot;table_name&quot;,
         *                     &quot;actions&quot;: [
         *                         &quot;Describe&quot;,
         *                         &quot;Select&quot;
         *                     ]
         *                 }
         *             ],
         *             &quot;resource&quot;: [
         *                 {
         *                     &quot;name&quot;: &quot;&quot;,
         *                     &quot;actions&quot;: []
         *                 },
         *                 {
         *                     &quot;name&quot;: &quot;&quot;,
         *                     &quot;actions&quot;: []
         *                 }
         *             ],
         *             &quot;function&quot;: [
         *                 {
         *                     &quot;name&quot;: &quot;&quot;,
         *                     &quot;actions&quot;: []
         *                 },
         *                 {
         *                     &quot;name&quot;: &quot;&quot;,
         *                     &quot;actions&quot;: []
         *                 }
         *             ]
         *         }
         *     },
         *     &quot;remove&quot;: {
         *         &quot;allowedProjectList&quot;: [
         *             {
         *                 &quot;project&quot;: &quot;project_name&quot;
         *             },
         *             {
         *                 &quot;project&quot;: &quot;project_2&quot;
         *             }
         *         ],
         *         &quot;resourceList&quot;: {
         *             &quot;table&quot;: [
         *                 {
         *                     &quot;name&quot;: &quot;table_name&quot;
         *                 },
         *                 {
         *                     &quot;name&quot;: &quot;table_name&quot;
         *                 }
         *             ],
         *             &quot;resource&quot;: [
         *                 {
         *                     &quot;name&quot;: &quot;&quot;
         *                 },
         *                 {
         *                     &quot;name&quot;: &quot;&quot;
         *                 }
         *             ],
         *             &quot;function&quot;: [
         *                 {
         *                     &quot;name&quot;: &quot;&quot;
         *                 },
         *                 {
         *                     &quot;name&quot;: &quot;&quot;
         *                 }
         *             ]
         *         }
         *     }
         * }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdatePackageRequest build() {
            return new UpdatePackageRequest(this);
        } 

    } 

}
