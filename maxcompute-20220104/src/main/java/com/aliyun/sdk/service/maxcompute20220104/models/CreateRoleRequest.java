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
 * {@link CreateRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateRoleRequest</p>
 */
public class CreateRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private CreateRoleRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRoleRequest, Builder> {
        private String projectName; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoleRequest request) {
            super(request);
            this.projectName = request.projectName;
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
         * <p>The request body parameters. For valid values, see <a href="https://help.aliyun.com/document_detail/27935.html">MaxCompute permissions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;: &quot;role_name&quot;,&quot;type&quot;: &quot;resource/adminn&quot;,&quot;policy&quot;: &quot;&quot;, // The document of the policy. This parameter is not required if an access-control list (ACL) is used. &quot;acl&quot;: { // This parameter is not required if a policy is used. &quot;table&quot;: [{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[&quot;&quot;,&quot;&quot;,]}, {&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}],&quot;resource&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[&quot;&quot;,&quot;&quot;,]}, {&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}],&quot;function&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[&quot;&quot;,&quot;&quot;,]}, {&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}],&quot;package&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[&quot;&quot;,&quot;&quot;,]}, {&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}],&quot;project&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}], // Only the current project is displayed in the console. &quot;instance&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}] // The parameter name must be set to an asterisk (*) in the console. }}// An asterisk (*) can be specified for name.</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateRoleRequest build() {
            return new CreateRoleRequest(this);
        } 

    } 

}
