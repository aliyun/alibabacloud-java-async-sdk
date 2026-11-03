// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>GetWorkspaceRequest</p>
 */
public class GetWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraVerboseFields")
    private String extraVerboseFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private GetWorkspaceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.extraVerboseFields = builder.extraVerboseFields;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return extraVerboseFields
     */
    public String getExtraVerboseFields() {
        return this.extraVerboseFields;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetWorkspaceRequest, Builder> {
        private String workspaceId; 
        private String extraVerboseFields; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkspaceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.extraVerboseFields = request.extraVerboseFields;
            this.verbose = request.verbose;
        } 

        /**
         * <p>The workspace ID. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>A comma-separated string used to specify additional information to return. This field does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>NotSupport</p>
         */
        public Builder extraVerboseFields(String extraVerboseFields) {
            this.putQueryParameter("ExtraVerboseFields", extraVerboseFields);
            this.extraVerboseFields = extraVerboseFields;
            return this;
        }

        /**
         * <p>Specifies whether to display supplementary information such as the workspace owner. Valid values:</p>
         * <ul>
         * <li>false: Does not display supplementary information.</li>
         * <li>true: Displays supplementary information.
         * Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetWorkspaceRequest build() {
            return new GetWorkspaceRequest(this);
        } 

    } 

}
