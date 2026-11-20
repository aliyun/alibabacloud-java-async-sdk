// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Develop")
    private String develop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.develop = builder.develop;
        this.dryRun = builder.dryRun;
        this.labels = builder.labels;
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return develop
     */
    public String getDevelop() {
        return this.develop;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private String clientToken; 
        private String develop; 
        private Boolean dryRun; 
        private java.util.Map<String, String> labels; 
        private String workspaceId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.develop = request.develop;
            this.dryRun = request.dryRun;
            this.labels = request.labels;
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5db780a0-9d3e-4f35-a84a-xxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enter development mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder develop(String develop) {
            this.putQueryParameter("Develop", develop);
            this.develop = develop;
            return this;
        }

        /**
         * <p>Specifies whether to only perform a dry run for this request.</p>
         * <ul>
         * <li><p>true: A check request is sent, and no actual operation is performed. If the check fails, the corresponding error is returned. If the check succeeds, the error code DryRunOperation is returned.</p>
         * </li>
         * <li><p>false (default): A normal request is sent.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The user-defined labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder labels(java.util.Map<String, String> labels) {
            String labelsShrink = shrink(labels, "Labels", "json");
            this.putQueryParameter("Labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The request body. For instructions on key request parameter settings, see <strong>Table 1. Request body parameters</strong> and <strong>Table 2. Metadata parameters</strong> below. For more details about parameter settings, see <a href="https://help.aliyun.com/document_detail/450525.html">All related metric description for service models</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Service deployed by using an image:
         * {
         *   &quot;name&quot;: &quot;foo&quot;,
         *   &quot;metadata&quot;: {
         *     &quot;instance&quot;: 2,
         *     &quot;memory&quot;: 7000,
         *     &quot;cpu&quot;: 4
         *     },
         *   &quot;containers&quot;: [
         *     {
         *       &quot;image&quot;: &quot;<strong><strong>&quot;,
         *       &quot;script&quot;: &quot;</strong></strong> --listen=0.0.0.0 --server_port=8000 --headless&quot;,
         *       &quot;port&quot;: 8000
         *     }
         *   ],
         *   &quot;storage&quot;: [
         *     {
         *       &quot;oss&quot;: {
         *         &quot;path&quot;: &quot;oss://examplebuket/data111/&quot;,
         *         &quot;readOnly&quot;: false
         *       },
         *       &quot;properties&quot;: {
         *         &quot;resource_type&quot;: &quot;model&quot;
         *       },
         *       &quot;mount_path&quot;: &quot;/data&quot;
         *     }
         *   ]
         * }
         * AI-Web application deployed by using an image:
         * {
         *   &quot;name&quot;: &quot;foo&quot;,
         *   &quot;metadata&quot;: {
         *     &quot;instance&quot;: 1,
         *     &quot;memory&quot;: 7000,
         *     &quot;cpu&quot;: 4,
         *     &quot;enable_webservice&quot;: true
         *   },
         *   &quot;containers&quot;: [
         *     {
         *       &quot;image&quot;: &quot;<strong><strong>&quot;,
         *       &quot;script&quot;: &quot;</strong></strong> --listen=0.0.0.0 --server_port=8000 --headless&quot;,
         *       &quot;port&quot;: 8000
         *     }
         *   ],
         *   &quot;storage&quot;: [
         *     {
         *       &quot;oss&quot;: {
         *         &quot;path&quot;: &quot;oss://examplebucket/data111/&quot;,
         *         &quot;readOnly&quot;: false
         *       },
         *       &quot;properties&quot;: {
         *       &quot;resource_type&quot;: &quot;model&quot;
         *       },
         *       &quot;mount_path&quot;: &quot;/data&quot;
         *     }
         *   ]
         * }
         * Service deployed by using a model and a processor:
         * {
         *   &quot;metadata&quot;: {
         *     &quot;instance&quot;: 1,
         *     &quot;memory&quot;: 7000,
         *     &quot;cpu&quot;: 4
         *   },
         *   &quot;name&quot;: &quot;foo&quot;,
         *   &quot;model_config&quot;: {},
         *   &quot;processor_type&quot;: &quot;python&quot;,
         *   &quot;processor_path&quot;: &quot;oss://<strong><strong>&quot;,
         *   &quot;processor_entry&quot;: &quot;a.py&quot;,
         *   &quot;model_path&quot;: &quot;oss://</strong></strong>&quot;
         * }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

}
