// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link PreviewMCTableRequest} extends {@link RequestModel}
 *
 * <p>PreviewMCTableRequest</p>
 */
public class PreviewMCTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Partition")
    private String partition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private PreviewMCTableRequest(Builder builder) {
        super(builder);
        this.tableName = builder.tableName;
        this.endpoint = builder.endpoint;
        this.limit = builder.limit;
        this.partition = builder.partition;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewMCTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return partition
     */
    public String getPartition() {
        return this.partition;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PreviewMCTableRequest, Builder> {
        private String tableName; 
        private String endpoint; 
        private Integer limit; 
        private String partition; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PreviewMCTableRequest request) {
            super(request);
            this.tableName = request.tableName;
            this.endpoint = request.endpoint;
            this.limit = request.limit;
            this.partition = request.partition;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_hb_user_fdsaf_hi</p>
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.cn-hangzhou-vpc.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou-vpc.maxcompute.aliyun-inc.com/api</a></p>
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Partition.
         */
        public Builder partition(String partition) {
            this.putQueryParameter("Partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public PreviewMCTableRequest build() {
            return new PreviewMCTableRequest(this);
        } 

    } 

}
