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
 * {@link UpdateCubeBySqlRequest} extends {@link RequestModel}
 *
 * <p>UpdateCubeBySqlRequest</p>
 */
public class UpdateCubeBySqlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cubeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomSql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customSql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dsId;

    @com.aliyun.core.annotation.Query
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

    private UpdateCubeBySqlRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
        this.customSql = builder.customSql;
        this.dsId = builder.dsId;
        this.placeholders = builder.placeholders;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCubeBySqlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cubeId
     */
    public String getCubeId() {
        return this.cubeId;
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

    public static final class Builder extends Request.Builder<UpdateCubeBySqlRequest, Builder> {
        private String cubeId; 
        private String customSql; 
        private String dsId; 
        private String placeholders; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCubeBySqlRequest request) {
            super(request);
            this.cubeId = request.cubeId;
            this.customSql = request.customSql;
            this.dsId = request.dsId;
            this.placeholders = request.placeholders;
            this.userId = request.userId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The dataset ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * <p>The custom SQL statement.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from sdsd</p>
         */
        public Builder customSql(String customSql) {
            this.putQueryParameter("CustomSql", customSql);
            this.customSql = customSql;
            return this;
        }

        /**
         * <p>The data source ID.</p>
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
            this.putQueryParameter("Placeholders", placeholders);
            this.placeholders = placeholders;
            return this;
        }

        /**
         * <p>The user ID of a Quick BI user who has permissions to create datasets. This is not your Alibaba Cloud account ID. You can call the <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryUserInfoByAccount?spm=api-workbench.api_explorer.0.0.672f50daGq9ooV&params=%7B%7D&tab=DOC&sdkStyle=old&RegionId=cn-hangzhou">QueryUserInfoByAccount</a> operation to obtain the user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
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
        public UpdateCubeBySqlRequest build() {
            return new UpdateCubeBySqlRequest(this);
        } 

    } 

}
