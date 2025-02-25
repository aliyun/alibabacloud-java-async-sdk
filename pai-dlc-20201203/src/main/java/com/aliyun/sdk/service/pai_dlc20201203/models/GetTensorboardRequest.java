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
         * JodId.
         */
        public Builder jodId(String jodId) {
            this.putQueryParameter("JodId", jodId);
            this.jodId = jodId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * WorkspaceId.
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
