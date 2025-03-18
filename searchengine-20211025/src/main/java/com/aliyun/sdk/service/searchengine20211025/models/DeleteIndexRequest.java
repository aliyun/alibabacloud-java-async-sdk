// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link DeleteIndexRequest} extends {@link RequestModel}
 *
 * <p>DeleteIndexRequest</p>
 */
public class DeleteIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("indexName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deleteDataSource")
    private Boolean deleteDataSource;

    private DeleteIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexName = builder.indexName;
        this.dataSource = builder.dataSource;
        this.deleteDataSource = builder.deleteDataSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndexRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return dataSource
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @return deleteDataSource
     */
    public Boolean getDeleteDataSource() {
        return this.deleteDataSource;
    }

    public static final class Builder extends Request.Builder<DeleteIndexRequest, Builder> {
        private String instanceId; 
        private String indexName; 
        private String dataSource; 
        private Boolean deleteDataSource; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.indexName = request.indexName;
            this.dataSource = request.dataSource;
            this.deleteDataSource = request.deleteDataSource;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42p5oi202</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The index name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>generation</p>
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * <p>The data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0js04_test</p>
         */
        public Builder dataSource(String dataSource) {
            this.putQueryParameter("dataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>Specifies whether to delete the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteDataSource(Boolean deleteDataSource) {
            this.putQueryParameter("deleteDataSource", deleteDataSource);
            this.deleteDataSource = deleteDataSource;
            return this;
        }

        @Override
        public DeleteIndexRequest build() {
            return new DeleteIndexRequest(this);
        } 

    } 

}
