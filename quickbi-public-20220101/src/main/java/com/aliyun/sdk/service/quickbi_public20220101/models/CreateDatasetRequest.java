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
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDirectoryId")
    private String targetDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDefineCubeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userDefineCubeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.dsId = builder.dsId;
        this.tableName = builder.tableName;
        this.targetDirectoryId = builder.targetDirectoryId;
        this.userDefineCubeName = builder.userDefineCubeName;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dsId
     */
    public String getDsId() {
        return this.dsId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return targetDirectoryId
     */
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

    /**
     * @return userDefineCubeName
     */
    public String getUserDefineCubeName() {
        return this.userDefineCubeName;
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

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String dsId; 
        private String tableName; 
        private String targetDirectoryId; 
        private String userDefineCubeName; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.dsId = request.dsId;
            this.tableName = request.tableName;
            this.targetDirectoryId = request.targetDirectoryId;
            this.userDefineCubeName = request.userDefineCubeName;
            this.userId = request.userId;
            this.workspaceId = request.workspaceId;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>st_trd_user_purchase_day_inc</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * TargetDirectoryId.
         */
        public Builder targetDirectoryId(String targetDirectoryId) {
            this.putQueryParameter("TargetDirectoryId", targetDirectoryId);
            this.targetDirectoryId = targetDirectoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userDefineCubeName(String userDefineCubeName) {
            this.putQueryParameter("UserDefineCubeName", userDefineCubeName);
            this.userDefineCubeName = userDefineCubeName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>726bee5a-****-43e1-9a8e-b550f0120f35</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>726bee5a-****-43e1-9a8e-b550f0120f35</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDatasetRequest build() {
            return new CreateDatasetRequest(this);
        } 

    } 

}
