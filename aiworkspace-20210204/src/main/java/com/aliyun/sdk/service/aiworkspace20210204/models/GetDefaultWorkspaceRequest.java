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
 * {@link GetDefaultWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>GetDefaultWorkspaceRequest</p>
 */
public class GetDefaultWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private GetDefaultWorkspaceRequest(Builder builder) {
        super(builder);
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefaultWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetDefaultWorkspaceRequest, Builder> {
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetDefaultWorkspaceRequest request) {
            super(request);
            this.verbose = request.verbose;
        } 

        /**
         * <p>Specifies whether to show the details of the default workspace. The details include the conditions of the workspace in different phases. Valid values:</p>
         * <ul>
         * <li>false (default)</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetDefaultWorkspaceRequest build() {
            return new GetDefaultWorkspaceRequest(this);
        } 

    } 

}
