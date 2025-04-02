// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetTensorboardRequest} extends {@link RequestModel}
 *
 * <p>GetTensorboardRequest</p>
 */
public class GetTensorboardRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TensorboardId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
    private String tensorboardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JodId")
    private String jodId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetTensorboardRequest(Builder builder) {
        super(builder);
        this.tensorboardId = builder.tensorboardId;
        this.jodId = builder.jodId;
        this.token = builder.token;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTensorboardRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    /**
     * @return jodId
     */
    public String getJodId() {
        return this.jodId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetTensorboardRequest, Builder> {
        private String tensorboardId; 
        private String jodId; 
        private String token; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetTensorboardRequest request) {
            super(request);
            this.tensorboardId = request.tensorboardId;
            this.jodId = request.jodId;
            this.token = request.token;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The ID of the TensorBoard instance. For more information about how to obtain the ID of the TensorBoard instance, see <a href="https://help.aliyun.com/document_detail/459689.html">ListTensorboards</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tb-20210114104214-xxxxx</p>
         */
        public Builder tensorboardId(String tensorboardId) {
            this.putPathParameter("TensorboardId", tensorboardId);
            this.tensorboardId = tensorboardId;
            return this;
        }

        /**
         * <p>The job ID. For more information about how to query the job ID, see <a href="https://help.aliyun.com/document_detail/459676.html">ListJob</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-xxxxxxxx</p>
         */
        public Builder jodId(String jodId) {
            this.putQueryParameter("JodId", jodId);
            this.jodId = jodId;
            return this;
        }

        /**
         * <p>The information about the shared token. You can specify this parameter to obtain the permission to view a TensorBoard job based on the shared token information. You can execute <a href="https://help.aliyun.com/document_detail/2557813.html">GetTensorboardSharedUrl</a> and extract the shared token from the obtained information.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.e
         * yJleHAiOjE2OTUyODA0NTMsImlhdCI6MTY5NTE5NDA1MywidXNlcl9pZCI6IjExN
         * Tc3MDMyNzA5OTQ5MDEiLCJ0YXJnZXRfaWQiOiJ0YjRrOGxjNXhmdTM2b3B0Iiw
         * idGFyZ2V0X3R5cGUiOiJ0ZW5zb3Jib2FyZCJ9.6eT68J-KMBwwfN2d7fj7u6vyPcf0erfqYeizd2N****</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The workspace ID. 
         * &lt;props=&quot;china&quot;&gt;For more information about how to query the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>46099</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetTensorboardRequest build() {
            return new GetTensorboardRequest(this);
        } 

    } 

}
