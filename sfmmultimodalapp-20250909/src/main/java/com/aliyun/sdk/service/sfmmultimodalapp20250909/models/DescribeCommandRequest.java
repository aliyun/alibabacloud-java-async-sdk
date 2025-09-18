// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link DescribeCommandRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommandRequest</p>
 */
public class DescribeCommandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DescribeCommandRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.domainCode = builder.domainCode;
        this.toolId = builder.toolId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommandRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    /**
     * @return toolId
     */
    public String getToolId() {
        return this.toolId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeCommandRequest, Builder> {
        private String appId; 
        private String domainCode; 
        private String toolId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommandRequest request) {
            super(request);
            this.appId = request.appId;
            this.domainCode = request.domainCode;
            this.toolId = request.toolId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm-xxxxx</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>343894343</p>
         */
        public Builder domainCode(String domainCode) {
            this.putQueryParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4864343453445</p>
         */
        public Builder toolId(String toolId) {
            this.putQueryParameter("ToolId", toolId);
            this.toolId = toolId;
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
        public DescribeCommandRequest build() {
            return new DescribeCommandRequest(this);
        } 

    } 

}
