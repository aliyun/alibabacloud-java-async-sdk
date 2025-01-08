// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link PutProjectPolicyRequest} extends {@link RequestModel}
 *
 * <p>PutProjectPolicyRequest</p>
 */
public class PutProjectPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private PutProjectPolicyRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutProjectPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PutProjectPolicyRequest, Builder> {
        private String project; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(PutProjectPolicyRequest request) {
            super(request);
            this.project = request.project;
            this.body = request.body;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The project policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{ 	&quot;Version&quot;: &quot;1&quot;, 	&quot;Statement&quot;: [{ 		&quot;Action&quot;: [&quot;log:PostLogStoreLogs&quot;], 		&quot;Resource&quot;: &quot;acs:log:<em>:</em>:project/exampleproject/<em>&quot;, 		&quot;Effect&quot;: &quot;Deny&quot;, 		&quot;Condition&quot;: { 			&quot;StringNotLike&quot;: { 				&quot;acs:SourceVpc&quot;: [&quot;vpc-</em>&quot;] 			} 		} 	}] }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PutProjectPolicyRequest build() {
            return new PutProjectPolicyRequest(this);
        } 

    } 

}
