// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link CreateCubeBySqlRequest} extends {@link RequestModel}
 *
 * <p>CreateCubeBySqlRequest</p>
 */
public class CreateCubeBySqlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caption")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomSql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customSql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dsId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Placeholders")
    private String placeholders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateCubeBySqlRequest(Builder builder) {
        super(builder);
        this.caption = builder.caption;
        this.customSql = builder.customSql;
        this.dsId = builder.dsId;
        this.placeholders = builder.placeholders;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCubeBySqlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caption
     */
    public String getCaption() {
        return this.caption;
    }

    /**
     * @return customSql
     */
    public String getCustomSql() {
        return this.customSql;
    }

    /**
     * @return dsId
     */
    public String getDsId() {
        return this.dsId;
    }

    /**
     * @return placeholders
     */
    public String getPlaceholders() {
        return this.placeholders;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateCubeBySqlRequest, Builder> {
        private String caption; 
        private String customSql; 
        private String dsId; 
        private String placeholders; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCubeBySqlRequest request) {
            super(request);
            this.caption = request.caption;
            this.customSql = request.customSql;
            this.dsId = request.dsId;
            this.placeholders = request.placeholders;
            this.userId = request.userId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The name of the custom dataset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder caption(String caption) {
            this.putQueryParameter("Caption", caption);
            this.caption = caption;
            return this;
        }

        /**
         * <p>The custom SQL statement.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from qqq</p>
         */
        public Builder customSql(String customSql) {
            this.putQueryParameter("CustomSql", customSql);
            this.customSql = customSql;
            return this;
        }

        /**
         * <p>The ID of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7AAB95D-*****-****-*4FC0C976</p>
         */
        public Builder dsId(String dsId) {
            this.putQueryParameter("DsId", dsId);
            this.dsId = dsId;
            return this;
        }

        /**
         * <p>The placeholder parameters. For more information, see the supplementary description below.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;name&quot;: &quot;test&quot;,
         *         &quot;style&quot;: &quot;placeholder&quot;,
         *         &quot;type&quot;: &quot;string&quot;
         *     }
         * ]</p>
         */
        public Builder placeholders(String placeholders) {
            this.putBodyParameter("Placeholders", placeholders);
            this.placeholders = placeholders;
            return this;
        }

        /**
         * <p>The UserId of a Quick BI user who has permissions to create datasets. This is not your Alibaba Cloud account ID. You can call the <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryUserInfoByAccount?spm=api-workbench.api_explorer.0.0.672f50daGq9ooV&params=%7B%7D&tab=DOC&sdkStyle=old&RegionId=ap-southeast-1">QueryUserInfoByAccount</a> operation to obtain the UserId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asdaf-asda*****asd</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateCubeBySqlRequest build() {
            return new CreateCubeBySqlRequest(this);
        } 

    } 

}
