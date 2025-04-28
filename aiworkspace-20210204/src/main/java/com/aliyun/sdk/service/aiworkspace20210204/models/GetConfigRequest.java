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
 * {@link GetConfigRequest} extends {@link RequestModel}
 *
 * <p>GetConfigRequest</p>
 */
public class GetConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigKey")
    private String configKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private String verbose;

    private GetConfigRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.categoryName = builder.categoryName;
        this.configKey = builder.configKey;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRequest create() {
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
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    /**
     * @return verbose
     */
    public String getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetConfigRequest, Builder> {
        private String workspaceId; 
        private String categoryName; 
        private String configKey; 
        private String verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.categoryName = request.categoryName;
            this.configKey = request.configKey;
            this.verbose = request.verbose;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234******2</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * CategoryName.
         */
        public Builder categoryName(String categoryName) {
            this.putQueryParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * ConfigKey.
         */
        public Builder configKey(String configKey) {
            this.putQueryParameter("ConfigKey", configKey);
            this.configKey = configKey;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(String verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetConfigRequest build() {
            return new GetConfigRequest(this);
        } 

    } 

}
